package irvine.math.group;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Exact orbit BFS for binary row-addition distance. The two-sided
 * Cayley graph has the same spheres about I as the ordinary graph.
 * @author Gregory Morse
 */
public final class BinaryRowReductionCensus {
  private static final long COLUMN = 0x0101010101010101L;
  private static final boolean COMPACT_SEGMENTS = Boolean.getBoolean("row.census.compact");
  private static final boolean DEFER_FILTER = Boolean.getBoolean("row.census.deferFilter");
  private static final boolean FAST_READER = Boolean.getBoolean("row.census.fastReader");
  private final int mN;
  private final int mMask;
  private final int mFactorial;
  private final int mMaxLayer;
  private final int mLastCapacity;
  private final int mThreads;
  private final long mIdentity;
  private final int[] mRows = new int[8];
  private final int[] mCols = new int[8];
  private final int[][] mPartitions = new int[8][8];
  private final int[][] mSplitBlocks = new int[8][8];
  private final long[][] mScores = new long[8][8];
  private final int[] mOrder = new int[8];
  private final long[] mImages = new long[4];
  private final long[] mProfiles = new long[4];
  private final long[] mPrevious = new long[4];
  private final int[] mPreviousAut = new int[4];
  private long mLeast;
  private long mPermInput;
  private int mAutomorphisms;
  private long mRepresentative;
  private int mWeight;

  private BinaryRowReductionCensus(final int n, final int maxLayer) {
    this(n, maxLayer, 16);
  }

  private BinaryRowReductionCensus(final int n, final int maxLayer, final int lastCapacity) {
    this(n, maxLayer, lastCapacity, 1);
  }

  private BinaryRowReductionCensus(final int n, final int maxLayer, final int lastCapacity, final int threads) {
    mN = n;
    mMaxLayer = maxLayer;
    mLastCapacity = lastCapacity;
    mThreads = threads;
    mMask = (1 << n) - 1;
    int factorial = 1;
    long identity = 0;
    for (int j = 0; j < n; ++j) {
      factorial *= j + 1;
      identity |= 1L << (9 * j);
    }
    mIdentity = identity;
    mFactorial = factorial;
  }

  private static long transpose(long x) {
    long t = (x ^ (x >>> 7)) & 0x00aa00aa00aa00aaL;
    x ^= t ^ (t << 7);
    t = (x ^ (x >>> 14)) & 0x0000cccc0000ccccL;
    x ^= t ^ (t << 14);
    t = (x ^ (x >>> 28)) & 0x00000000f0f0f0f0L;
    return x ^ t ^ (t << 28);
  }

  private static long rowAdd(final long x, final int from, final int to) {
    return x ^ (((x >>> (8 * from)) & 255L) << (8 * to));
  }

  private static long colAdd(final long x, final int from, final int to) {
    return x ^ (((x >>> from) & COLUMN) << to);
  }

  private long inverse(long x) {
    long y = mIdentity;
    for (int i = 0; i < mN; ++i) {
      final long bit = 1L << i;
      int j = i;
      while (j < mN && ((x >>> (8 * j)) & bit) == 0) {
        ++j;
      }
      if (j == mN) {
        throw new IllegalStateException("Singular matrix");
      }
      if (i != j) {
        x = rowAdd(rowAdd(rowAdd(x, i, j), j, i), i, j);
        y = rowAdd(rowAdd(rowAdd(y, i, j), j, i), i, j);
      }
      for (int k = 0; k < mN; ++k) {
        if (k != i && ((x >>> (8 * k)) & bit) != 0) {
          x = rowAdd(x, i, k);
          y = rowAdd(y, i, k);
        }
      }
    }
    return y;
  }

  private long rowProfile(long x) {
    long h = 0;
    for (int j = 0; j < mN; ++j) {
      h += 1L << (4 * Long.bitCount(x & 255L));
      x >>>= 8;
    }
    return h;
  }

  private void canonical(final long x, final long inv) {
    final long tr = transpose(x);
    final long invTr = transpose(inv);
    final long[] images = mImages;
    final long[] profiles = mProfiles;
    images[0] = x;
    images[1] = tr;
    images[2] = inv;
    images[3] = invTr;
    // Transposing preserves total weight, and a heavier matrix can
    // never beat a lighter one. Compute row histograms only for ties.
    final int bits = Long.bitCount(x);
    final int invBits = Long.bitCount(inv);
    final int lo = bits <= invBits ? 0 : 2;
    final int hi = invBits <= bits ? 4 : 2;
    long profile = Long.MAX_VALUE;
    for (int i = lo; i < hi; ++i) {
      profiles[i] = rowProfile(images[i]);
      profile = Math.min(profile, profiles[i]);
    }
    long least = -1L;
    int ties = 0;
    int aut = 0;
    final long[] previous = mPrevious;
    final int[] previousAut = mPreviousAut;
    Arrays.fill(previousAut, 0);
    for (int i = lo; i < hi; ++i) {
      if (profiles[i] == profile) {
        int j = lo;
        while (j < i && (previousAut[j] == 0 || images[j] != images[i])) {
          ++j;
        }
        if (j < i) {
          mLeast = previous[j];
          mAutomorphisms = previousAut[j];
        } else {
          permCanonical(images[i], images[i ^ 1]);
        }
        previous[i] = mLeast;
        previousAut[i] = mAutomorphisms;
        final int k = Long.compareUnsigned(mLeast, least);
        if (k < 0) {
          least = mLeast;
          ties = 1;
          aut = mAutomorphisms;
        } else if (k == 0) {
          ++ties;
        }
      }
    }
    mRepresentative = least;
    mWeight = 4 * mFactorial / (aut * ties);
  }

  private void permCanonical(final long x, final long tr) {
    mPermInput = x;
    for (int i = 0; i < mN; ++i) {
      mRows[i] = (int) (x >>> (8 * i)) & mMask;
      mCols[i] = (int) (tr >>> (8 * i)) & mMask;
    }
    int off = mMask;
    for (int i = 0; i < mN; ++i) {
      off &= ~(mRows[i] & (1 << i));
    }
    int count = 0;
    if (off != 0) {
      mPartitions[0][count++] = off;
    }
    if (off != mMask) {
      mPartitions[0][count++] = mMask ^ off;
    }
    mLeast = -1L;
    mAutomorphisms = 0;
    refine(0, count, 1);
  }

  private int split(final int depth, final int count) {
    final int[] blocks = mPartitions[depth];
    final long[] keys = mScores[depth];
    boolean changed;
    int length = count;
    do {
      changed = false;
      final int[] newBlocks = mSplitBlocks[depth];
      int end = 0;
      for (int i = 0; i < length; ++i) {
        final int mask = blocks[i];
        if ((mask & (mask - 1)) == 0) {
          newBlocks[end++] = mask;
        } else {
          int endKeys = 0;
          for (int t = mask; t != 0; t &= t - 1) {
            final int v = Integer.numberOfTrailingZeros(t);
            long score = 0;
            for (int j = 0; j < length; ++j) {
              score = (score << 7) | (9 * Integer.bitCount(mRows[v] & blocks[j]) + Integer.bitCount(mCols[v] & blocks[j]));
            }
            keys[endKeys++] = (score << 3) | v;
          }
          Arrays.sort(keys, 0, endKeys);
          int cl = 0;
          long last = -1;
          for (int k = 0; k < endKeys; ++k) {
            final long score = keys[k] >>> 3;
            if (score != last && cl != 0) {
              newBlocks[end++] = cl;
              changed = true;
              cl = 0;
            }
            cl |= 1 << (int) (keys[k] & 7);
            last = score;
          }
          newBlocks[end++] = cl;
        }
      }
      System.arraycopy(newBlocks, 0, blocks, 0, end);
      length = end;
    } while (changed && length < mN);
    return length;
  }

  private boolean twins(final int a, final int b) {
    final int mask = (1 << a) | (1 << b);
    return ((mRows[a] ^ mRows[b]) & ~mask) == 0
      && ((mCols[a] ^ mCols[b]) & ~mask) == 0
      && ((mRows[a] >>> a) & 1) == ((mRows[b] >>> b) & 1)
      && ((mRows[a] >>> b) & 1) == ((mRows[b] >>> a) & 1);
  }

  private void refine(final int depth, final int count, final int multiplicity) {
    final int len = split(depth, count);
    final int[] partition = mPartitions[depth];
    if (len == mN) {
      long columns = 0;
      for (int i = 0; i < len; ++i) {
        final int v = Integer.numberOfTrailingZeros(partition[i]);
        mOrder[i] = v;
        columns |= ((mPermInput >>> v) & COLUMN) << i;
      }
      long key = 0;
      for (int i = 0; i < len; ++i) {
        key |= ((columns >>> (mOrder[i] << 3)) & 255L) << (i << 3);
      }
      final int c = Long.compareUnsigned(key, mLeast);
      if (c < 0) {
        mLeast = key;
        mAutomorphisms = multiplicity;
      } else if (c == 0) {
        mAutomorphisms += multiplicity;
      }
      return;
    }
    int pick = -1;
    int length = mN + 1;
    for (int k = 0; k < len; ++k) {
      final int size = Integer.bitCount(partition[k]);
      if (size > 1 && size < length) {
        pick = k;
        length = size;
      }
    }
    final int mask = partition[pick];
    int remaining = mask;
    while (remaining != 0) {
      final int bit = Integer.lowestOneBit(remaining);
      final int v = Integer.numberOfTrailingZeros(bit);
      remaining ^= bit;
      int related = 1;
      for (int t = remaining; t != 0; t &= t - 1) {
        final int w = Integer.numberOfTrailingZeros(t);
        if (twins(v, w)) {
          remaining ^= 1 << w;
          ++related;
        }
      }
      final int[] child = mPartitions[depth + 1];
      System.arraycopy(partition, 0, child, 0, pick);
      child[pick] = bit;
      child[pick + 1] = mask ^ bit;
      System.arraycopy(partition, pick + 1, child, pick + 2, len - pick - 1);
      refine(depth + 1, len + 1, multiplicity * related);
    }
  }

  private interface OrbitSink {
    boolean add(long x);

    int size();
  }

  private static final class Layer implements OrbitSink {
    private long[] mTable;
    private int mSize;
    private final int mLimit;
    private final boolean mTight;

    private Layer(final int limit) {
      this(limit, 16);
    }

    private Layer(final int limit, final int capacity) {
      this(limit, capacity, false);
    }

    private Layer(final int limit, final int capacity, final boolean tight) {
      mLimit = limit;
      mTable = new long[capacity];
      mTight = tight;
    }

    private int slot(final long v) {
      long h = v;
      h = (h ^ (h >>> 33)) * 0xff51afd7ed558ccdL;
      h = (h ^ (h >>> 33)) * 0xc4ceb9fe1a85ec53L;
      final int mask = mTable.length - 1;
      int i = (int) (h ^ (h >>> 33)) & mask;
      while (mTable[i] != 0 && mTable[i] != v) {
        i = (i + 1) & mask;
      }
      return i;
    }

    private boolean contains(final long x) {
      return mTable[slot(x)] != 0;
    }

    @Override
    public boolean add(final long x) {
      int i = slot(x);
      if (mTable[i] != 0) {
        return false;
      }
      if (mSize >= mLimit) {
        throw new IllegalStateException("Stopped safely at the configured orbit limit: " + mLimit);
      }
      if (mTight ? 8L * mSize >= 7L * mTable.length : 4L * mSize >= 3L * mTable.length) {
        final long[] old = mTable;
        mTable = new long[2 * old.length];
        for (final long y : old) {
          if (y != 0) {
            mTable[slot(y)] = y;
          }
        }
        i = slot(x);
      }
      mTable[i] = x;
      ++mSize;
      return true;
    }

    @Override
    public int size() {
      return mSize;
    }
  }

  // Exact terminal set. Address plus displacement determines all the
  // low bits of the bijective hash; the cell records the remaining bits.
  private static final class QuotientLayer implements OrbitSink {
    private static final VarHandle CELLS = MethodHandles.arrayElementVarHandle(int[].class);
    private final int[][] mTable;
    private final int mSegmentBits;
    private final int mSegmentMask;
    private final int mN;
    private final int mBits;
    private final int mDisplacementBits;
    private final long mKeyMask;
    private final int mAddressMask;
    private final int mDisplacementMask;
    private final int mLimit;
    private final boolean mParallel;
    private final AtomicInteger mConcurrentSize = new AtomicInteger();
    private int mSize;

    private QuotientLayer(final int n, final int bits, final int limit, final boolean parallel) {
      final int tags = n * n - bits;
      if (n > 7 || tags < 1 || tags > 28 || bits < 4 || bits > 28) {
        throw new IllegalArgumentException("Terminal keys cannot be packed at this capacity");
      }
      mN = n;
      mParallel = parallel;
      mBits = bits;
      mSegmentBits = Math.min(bits, 16);
      mTable = new int[1 << (bits - mSegmentBits)][1 << mSegmentBits];
      mSegmentMask = (1 << mSegmentBits) - 1;
      final int capacity = 1 << bits;
      mAddressMask = capacity - 1;
      mDisplacementBits = Integer.SIZE - tags;
      mDisplacementMask = (int) ((1L << mDisplacementBits) - 1);
      mKeyMask = (1L << (n * n)) - 1;
      mLimit = Math.min(limit, capacity - (capacity >>> 2));
    }

    private long hash(final long x) {
      long v = 0;
      for (int j = 0; j < mN; ++j) {
        v |= ((x >>> (8 * j)) & ((1L << mN) - 1)) << (mN * j);
      }
      v = ((v ^ (v >>> 23)) * 0xff51afd7ed558ccdL) & mKeyMask;
      v = ((v ^ (v >>> 19)) * 0xc4ceb9fe1a85ec53L) & mKeyMask;
      return v ^ (v >>> 23);
    }

    @Override
    public boolean add(final long x) {
      final long h = hash(x);
      final int home = (int) h & mAddressMask;
      final int tag = (int) (h >>> mBits) << mDisplacementBits;
      for (int d = 1; d <= mDisplacementMask; ++d) {
        final int s = (home + d - 1) & mAddressMask;
        final int[] block = mTable[s >>> mSegmentBits];
        final int offset = s & mSegmentMask;
        final int cell = mParallel ? (int) CELLS.getVolatile(block, offset) : block[offset];
        if (cell == (tag | d)) {
          return false;
        }
        if (cell == 0) {
          if (mParallel) {
            if (CELLS.compareAndSet(block, offset, 0, tag | d)) {
              if (mConcurrentSize.incrementAndGet() > mLimit) {
                throw new IllegalStateException("Stopped safely at the compressed orbit limit: " + mLimit);
              }
              return true;
            }
            --d; // The winner might have inserted this identical key.
            continue;
          }
          if (mSize >= mLimit) {
            throw new IllegalStateException("Stopped safely at the compressed orbit limit: " + mLimit);
          }
          block[offset] = tag | d;
          ++mSize;
          return true;
        }
      }
      throw new IllegalStateException("Compressed orbit displacement exceeds the exact encoding");
    }

    @Override
    public int size() {
      return mParallel ? mConcurrentSize.get() : mSize;
    }
  }

  private int visit(final Layer old, final Layer current, final OrbitSink next, final long x, final long inverse) {
    canonical(x, inverse);
    return !old.contains(mRepresentative) && !current.contains(mRepresentative) && next.add(mRepresentative) ? mWeight : 0;
  }

  private long scanLayer(final Layer old, final Layer current, final OrbitSink next,
                         final int begin, final int end, final int depth, final AtomicInteger progress) {
    long total = 0;
    int parents = 0;
    for (int i = begin; i < end; ++i) {
      final long x = current.mTable[i];
      if (x != 0) {
        final long inverse = inverse(x);
        for (int from = 0; from < mN; ++from) {
          for (int to = 0; to < mN; ++to) {
            if (from != to) {
              total += visit(old, current, next, rowAdd(x, from, to), colAdd(inverse, to, from));
              if (x != mIdentity) {
                total += visit(old, current, next, colAdd(x, from, to), rowAdd(inverse, to, from));
              }
            }
          }
        }
        if (progress != null && ((++parents) & ((1 << 20) - 1)) == 0) {
          final int done = progress.addAndGet(1 << 20);
          if ((done & ((1 << 22) - 1)) == 0) {
            System.out.printf("Layer %d: %,d/%,d predecessor orbits processed%n", depth, done, current.mSize);
          }
          if (Thread.currentThread().isInterrupted()) {
            throw new IllegalStateException("Terminal scan cancelled");
          }
        }
      }
    }
    return total;
  }

  private long scanParallel(final Layer old, final Layer current, final OrbitSink next, final int depth) {
    final ExecutorService pool = Executors.newFixedThreadPool(mThreads);
    final List<Future<Long>> counts = new ArrayList<>();
    final AtomicInteger progress = new AtomicInteger();
    try {
      for (int i = 0; i < mThreads; ++i) {
        final int begin = (int) ((long) i * current.mTable.length / mThreads);
        final int end = (int) ((long) (i + 1) * current.mTable.length / mThreads);
        final BinaryRowReductionCensus worker = new BinaryRowReductionCensus(mN, mMaxLayer);
        counts.add(pool.submit(() -> worker.scanLayer(old, current, next, begin, end, depth, progress)));
      }
      long total = 0;
      for (final Future<Long> f : counts) {
        total = Math.addExact(total, f.get());
      }
      return total;
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new IllegalStateException("Terminal scan interrupted", e);
    } catch (final ExecutionException e) {
      throw new IllegalStateException("Terminal scan failed", e.getCause());
    } finally {
      pool.shutdownNow();
    }
  }

  /**
   * Successive distance spheres, retaining only the preceding two layers.
   */
  public static final class Row {
    private final BinaryRowReductionCensus mCensus;
    private Layer mOld;
    private Layer mCurrent;
    private int mDepth = 0;

    /**
     * Construct an in-memory row.
     * @param n binary matrix dimension
     * @param maxOrbits maximum number of representatives in one layer
     */
    public Row(final int n, final int maxOrbits) {
      if (n < 1 || n > 8 || maxOrbits < 1) {
        throw new IllegalArgumentException("Invalid binary row reduction census size");
      }
      mCensus = new BinaryRowReductionCensus(n, maxOrbits);
      mOld = new Layer(maxOrbits);
      mCurrent = new Layer(maxOrbits);
      mCurrent.add(mCensus.mIdentity);
    }

    /**
     * Next sphere size, or null at the end of the row.
     * @return sphere size
     */
    public Long next() {
      if (mDepth++ == 0) {
        return 1L;
      }
      if (mCurrent.mSize == 0) {
        return null;
      }
      final Layer next = new Layer(mCensus.mMaxLayer);
      final long total = mCensus.scanLayer(mOld, mCurrent, next, 0, mCurrent.mTable.length, mDepth - 1, null);
      mOld = mCurrent;
      mCurrent = next;
      return next.mSize == 0 ? null : total;
    }
  }

  /**
   * Compute or extend a checkpointed row on disk.
   * @param n matrix dimension
   * @param depth last requested distance
   * @param directory parent directory for checkpoints and scratch space
   * @param diskMiB disk-space cap in MiB
   * @param seconds wall-clock cap
   * @param workers workers
   * @return counts in distance order, including any later committed layers
   * @throws IOException if scratch data cannot be read or written
   * @throws InterruptedException if interrupted
   */
  public static List<Long> externalRow(final int n, final int depth, final Path directory,
                                       final long diskMiB, final long seconds, final int workers)
      throws IOException, InterruptedException {
    if (n < 1 || n > 8 || depth < 0 || diskMiB < 1 || diskMiB > (1L << 25)
      || seconds < 1 || seconds > 7L * 24 * 3600 || workers < 1 || workers > 8) {
      throw new IllegalArgumentException("Invalid external row reduction census configuration");
    }
    try (DiskBudget disk = new DiskBudget(directory, diskMiB << 20, seconds);
         Checkpoint checkpoint = new Checkpoint(directory.resolve("n" + n))) {
      return new BinaryRowReductionCensus(n, 1).runExternal(depth, disk, 1 << 20, checkpoint, 1 << 20, workers, false);
    }
  }

  private List<Long> run(final int maxDistance) {
    final List<Long> result = new ArrayList<>();
    result.add(1L);
    Layer old = new Layer(mMaxLayer);
    Layer current = new Layer(mMaxLayer);
    current.add(mIdentity);
    System.out.printf("%d 0 1 1%n", mN);
    for (int d = 1; d <= maxDistance; ++d) {
      final long start = System.nanoTime();
      final boolean compressed = d == maxDistance && mLastCapacity < 0;
      if (compressed) {
        System.out.printf("Predecessor tables: %d MiB; terminal table: %d MiB%n",
          (8L * (old.mTable.length + current.mTable.length)) >>> 20, (4L << -mLastCapacity) >>> 20);
      }
      final OrbitSink next = compressed
        ? new QuotientLayer(mN, -mLastCapacity, mMaxLayer, mThreads > 1)
        : new Layer(mMaxLayer, d == maxDistance ? mLastCapacity : 16, mLastCapacity < 0);
      final long total = compressed && mThreads > 1
        ? scanParallel(old, current, next, d)
        : scanLayer(old, current, next, 0, current.mTable.length, d, compressed ? new AtomicInteger() : null);
      if (next.size() == 0) {
        break;
      }
      result.add(total);
      System.out.printf("%d %d %d %d %.3fs%n", mN, d, total, next.size(), (System.nanoTime() - start) / 1e9);
      if (d == maxDistance) {
        break;
      }
      old = current;
      current = (Layer) next;
    }
    return result;
  }


  /** Immutable ordered stream of distinct orbit representatives. */
  private static final class OrbitFile {
    final Path path;
    final long length;

    OrbitFile(final Path path, final long length) {
      this.path = path;
      this.length = length;
    }
  }

  private static final class OrbitReader implements AutoCloseable {
    private final DataInputStream mInput;
    private final FileChannel mChannel;
    private final ByteBuffer mBuffer;
    private final byte[] mBytes;
    private int mReadAt;
    private int mReadUntil;
    private long mRest;
    private boolean mPresent;
    private long mHead;
    private long mOffset;
    private boolean mFirst = true;

    OrbitReader(final OrbitFile file) throws IOException {
      this(file, 0, 0, 0);
    }

    OrbitReader(final OrbitFile file, final long done, final long last, final long offset) throws IOException {
      this(file, done, last, offset, FAST_READER);
    }

    OrbitReader(final OrbitFile file, final long done, final long last, final long offset, final boolean bulk)
      throws IOException {
      final FileChannel channel = FileChannel.open(file.path, StandardOpenOption.READ);
      try {
        channel.position(offset);
        mChannel = channel;
        mInput = bulk ? null : new DataInputStream(new BufferedInputStream(Channels.newInputStream(channel), 1 << 16));
        mBytes = bulk ? new byte[1 << 16] : null;
        mBuffer = bulk ? ByteBuffer.wrap(mBytes) : null;
        mRest = file.length - done;
        mHead = last;
        mFirst = done == 0;
        mOffset = offset;
        advance();
      } catch (final IOException | RuntimeException e) {
        channel.close();
        throw e;
      }
    }

    private int readByte() throws IOException {
      if (mBytes == null) {
        return mInput.readUnsignedByte();
      }
      if (mReadAt == mReadUntil) {
        mBuffer.clear();
        do {
          mReadUntil = mChannel.read(mBuffer);
        } while (mReadUntil == 0);
        if (mReadUntil < 0) {
          throw new EOFException("Truncated sorted orbit file");
        }
        mReadAt = 0;
      }
      return mBytes[mReadAt++] & 255;
    }

    void advance() throws IOException {
      mPresent = mRest != 0;
      if (mPresent) {
        if (mFirst) {
          long first = 0;
          for (int k = 0; k < Long.BYTES; ++k) {
            first = (first << Byte.SIZE) | readByte();
          }
          mHead = first;
          mOffset += Long.BYTES;
          mFirst = false;
        } else {
          long step = 0;
          for (int j = 0; j < Long.SIZE; j += 7) {
            final int b = readByte();
            ++mOffset;
            if (j == 63 && b > 1) {
              throw new IOException("Invalid delta in sorted orbit file");
            }
            step |= (long) (b & 127) << j;
            if (b < 128) {
              break;
            }
          }
          final long next = mHead + step;
          if (next <= mHead) {
            throw new IOException("Unordered delta in sorted orbit file");
          }
          mHead = next;
        }
        --mRest;
      }
    }

    boolean seek(final long x) throws IOException {
      while (mPresent && mHead < x) {
        advance();
      }
      return mPresent && mHead == x;
    }

    @Override
    public void close() throws IOException {
      if (mInput != null) {
        mInput.close();
      } else {
        mChannel.close();
      }
    }
  }

  private static final class DiskBudget implements AutoCloseable {
    private final Path mDir;
    private final long mLimit;
    private final long mDeadline;
    private final long mMinFree;
    private final Set<Path> mFiles = new HashSet<>();
    private long mLive;
    private long mWrittenSinceCheck;
    private long mRetained;

    DiskBudget(final Path root, final long limit, final long seconds) throws IOException {
      final Path directory = root.toAbsolutePath().normalize();
      if (!Files.isDirectory(directory, LinkOption.NOFOLLOW_LINKS)) {
        throw new IOException("Scratch root must be an existing directory, not a link");
      }
      final long minFreeMib = Long.getLong("row.census.minFreeMiB", 512L);
      if (minFreeMib < 512 || minFreeMib > (1L << 25)) {
        throw new IllegalArgumentException("Invalid filesystem headroom");
      }
      mMinFree = minFreeMib << 20;
      if (Files.getFileStore(directory).getUsableSpace() < mMinFree) {
        throw new IOException("Not enough filesystem headroom to start the census");
      }
      mDir = Files.createTempDirectory(directory, "exact-row-census-");
      mLimit = limit;
      mDeadline = System.nanoTime() + 1_000_000_000L * seconds;
    }

    void checkTime() {
      if (Thread.currentThread().isInterrupted()) {
        throw new IllegalStateException("External census worker interrupted");
      }
      if (System.nanoTime() - mDeadline > 0) {
        throw new IllegalStateException("Stopped at external census time cap");
      }
    }

    synchronized void addBytes(final int bytes) throws IOException {
      if (mLive > mLimit - mRetained - bytes) {
        throw new IllegalStateException("Stopped at exact external census file-byte cap");
      }
      mLive += bytes;
      mWrittenSinceCheck += bytes;
      if (mWrittenSinceCheck >= (1L << 22)) {
        mWrittenSinceCheck = 0;
        checkTime();
        if (Files.getFileStore(mDir).getUsableSpace() < mMinFree) {
          throw new IllegalStateException("Stopped to preserve filesystem headroom");
        }
      }
    }

    synchronized Path file() throws IOException {
      checkTime();
      final Path path = Files.createTempFile(mDir, "layer-", ".bin");
      if (!mFiles.add(path)) {
        throw new IllegalStateException("duplicate scratch path");
      }
      return path;
    }

    synchronized boolean owns(final OrbitFile file) {
      return mFiles.contains(file.path);
    }

    synchronized void release(final OrbitFile file) throws IOException {
      if (!mFiles.contains(file.path) || !file.path.getParent().equals(mDir)
        || !file.path.getFileName().toString().matches("layer-[0-9]+\\.bin")) {
        throw new IllegalArgumentException("refusing to delete an unowned BFS file");
      }
      final long size = Files.size(file.path);
      Files.delete(file.path);
      mFiles.remove(file.path);
      mLive -= size;
    }

    @Override
    public void close() throws IOException {
      // Only paths allocated by this run; never recursive.
      for (final Path path : mFiles) {
        Files.deleteIfExists(path);
      }
      Files.deleteIfExists(mDir);
    }
  }

  /**
   * Only completed layers are exported. A manifest replacement is the
   * commit point: a failed run cannot silently publish a partial layer.
   */
  private static final class Checkpoint implements AutoCloseable {
    private final Path mRoot;
    private final Path mState;
    private final FileChannel mChannel;
    private final FileLock mLock;
    private final Set<Path> mWritten = new HashSet<>();
    private List<OrbitFile> mSaved = List.of();

    private static final class Progress {
      final Path path;
      final List<String> records = new ArrayList<>();
      final List<OrbitFile> segments = new ArrayList<>();
      long done;
      long last;
      long offset;

      Progress(final Path path, final String header) {
        this.path = path;
        records.add(header);
      }
    }

    Checkpoint(final Path root) throws IOException {
      mRoot = root.toAbsolutePath().normalize();
      if (!Files.exists(mRoot, LinkOption.NOFOLLOW_LINKS)) {
        Files.createDirectory(mRoot);
      }
      if (!Files.isDirectory(mRoot, LinkOption.NOFOLLOW_LINKS)) {
        throw new IOException("Checkpoint must be a directory, not a link");
      }
      mState = mRoot.resolve("row-census-state.txt");
      final Path lock = mRoot.resolve("row-census.lock");
      mChannel = FileChannel.open(lock, StandardOpenOption.CREATE, StandardOpenOption.WRITE, LinkOption.NOFOLLOW_LINKS);
      try {
        mLock = mChannel.tryLock();
        if (mLock == null) {
          throw new IOException("The checkpoint is already in use");
        }
      } catch (final IOException | RuntimeException e) {
        mChannel.close();
        throw e;
      }
    }

    @Override
    public void close() throws IOException {
      try {
        mLock.close();
      } finally {
        mChannel.close();
      }
    }

    private static String digest(final Path p, final DiskBudget disk) throws IOException {
      final MessageDigest hash;
      try {
        hash = MessageDigest.getInstance("SHA-256");
      } catch (final NoSuchAlgorithmException e) {
        throw new AssertionError(e);
      }
      try (DigestInputStream in = new DigestInputStream(Files.newInputStream(p), hash)) {
        final byte[] b = new byte[1 << 20];
        while (in.read(b) >= 0) {
          disk.checkTime();
        }
      }
      final StringBuilder out = new StringBuilder();
      for (final byte b : hash.digest()) {
        out.append(String.format("%02x", b & 255));
      }
      return out.toString();
    }

    private OrbitFile readLayer(final String row, final DiskBudget disk) throws IOException {
      final String[] record = row.split(" ");
      if (record.length != 4 || !record[0].matches("layer-[0-9]+\\.bin")
          || !record[3].matches("[a-f0-9]{64}")) {
        throw new IOException("Invalid checkpoint layer record");
      }
      final Path p = mRoot.resolve(record[0]);
      if (!Files.isRegularFile(p, LinkOption.NOFOLLOW_LINKS)) {
        throw new IOException("Missing regular checkpoint layer file");
      }
      final long length = Long.parseLong(record[1]);
      final long bytes = Files.size(p);
      if (length < 0 || length > bytes || bytes != Long.parseLong(record[2])
          || !digest(p, disk).equals(record[3])) {
        throw new IOException("Checkpoint layer size or digest mismatch");
      }
      return new OrbitFile(p, length);
    }

    List<Long> read(final int n, final DiskBudget disk) throws IOException {
      try (var existing = Files.newDirectoryStream(mRoot, "layer-*.bin")) {
        for (final Path f : existing) {
          if (!Files.isRegularFile(f, LinkOption.NOFOLLOW_LINKS)) {
            throw new IOException("Checkpoint includes a non-regular layer");
          }
          disk.mRetained = Math.addExact(disk.mRetained, Files.size(f));
        }
      }
      if (disk.mRetained > disk.mLimit) {
        throw new IOException("Existing checkpoint files exceed the configured disk budget");
      }
      if (!Files.exists(mState, LinkOption.NOFOLLOW_LINKS)) {
        return new ArrayList<>();
      }
      if (!Files.isRegularFile(mState, LinkOption.NOFOLLOW_LINKS) || Files.size(mState) > 4096) {
        throw new IOException("Invalid checkpoint manifest");
      }
      final List<String> lines = Files.readAllLines(mState);
      if (lines.size() != 4 || !lines.get(0).equals("row-census-v1 " + n)) {
        throw new IOException("Checkpoint does not match the census dimension or format");
      }
      final OrbitFile old = readLayer(lines.get(1), disk);
      final OrbitFile now = readLayer(lines.get(2), disk);
      if (old.path.equals(now.path) || now.length < 1 || disk.mRetained > disk.mLimit) {
        throw new IOException("Invalid checkpoint layers or disk budget");
      }
      mSaved = List.of(old, now);
      final List<Long> result = new ArrayList<>();
      for (final String v : lines.get(3).split(" ")) {
        result.add(Long.parseLong(v));
      }
      if (result.get(0) != 1 || result.get(result.size() - 1) < now.length
          || (result.size() == 1) != (old.length == 0)) {
        throw new IOException("Invalid checkpoint counts");
      }
      return result;
    }

    private static String describe(final OrbitFile f, final DiskBudget disk) throws IOException {
      return f.path.getFileName() + " " + f.length + " " + Files.size(f.path) + " " + digest(f.path, disk);
    }

    private Progress readSegments(final DiskBudget disk, final OrbitFile old, final OrbitFile now) throws IOException {
      final Path path = mRoot.resolve(now.path.getFileName() + ".segments.txt");
      final long bytes = Files.size(now.path);
      final String header = "row-census-segments-v1 " + old.path.getFileName() + " " + now.length + " " + bytes;
      final Progress p = new Progress(path, header);
      if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
        return p;
      }
      if (!Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS) || Files.size(path) > (8L << 20)) {
        throw new IOException("Invalid census segment manifest");
      }
      final List<String> lines = Files.readAllLines(path);
      if (lines.isEmpty() || !lines.get(0).equals(header)) {
        throw new IOException("Census segments do not belong to these input layers");
      }
      final Set<Path> seen = new HashSet<>();
      seen.add(old.path);
      seen.add(now.path);
      for (int i = 1; i < lines.size(); ++i) {
        final String row = lines.get(i);
        final String[] parts = row.split(" ", 4);
        if (parts.length != 4) {
          throw new IOException("Invalid census segment record");
        }
        final long done = Long.parseLong(parts[0]);
        final long last = Long.parseLong(parts[1]);
        final long offset = Long.parseLong(parts[2]);
        if (done <= p.done || done > now.length || offset <= p.offset || offset > bytes
            || (done == now.length) != (offset == bytes) || p.done > 0 && last <= p.last) {
          throw new IOException("Noncontiguous census segment manifest");
        }
        final OrbitFile f = readLayer(parts[3], disk);
        if (!seen.add(f.path)) {
          throw new IOException("Repeated census segment");
        }
        p.done = done;
        p.last = last;
        p.offset = offset;
        p.records.add(row);
        p.segments.add(f);
      }
      return p;
    }

    private void saveSegment(final DiskBudget disk, final Progress p, final OrbitFile f) throws IOException {
      if (p.records.size() >= 32768) {
        throw new IOException("Census segment manifest limit; choose larger batches");
      }
      final String check = " " + f.length + " " + Files.size(f.path) + " " + digest(f.path, disk);
      final OrbitFile copy = retain(f, disk);
      p.segments.add(copy);
      mWritten.add(copy.path);
      p.records.add(p.done + " " + p.last + " " + p.offset + " " + copy.path.getFileName() + check);
      publishSegments(p);
      if (COMPACT_SEGMENTS) {
        compactSegments(disk, p);
      }
    }

    private void publishSegments(final Progress p) throws IOException {
      final Path stage = Files.createTempFile(mRoot, "segments-", ".tmp");
      try {
        Files.write(stage, p.records);
        Files.move(stage, p.path, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
      } finally {
        Files.deleteIfExists(stage);
      }
    }

    private long cursor(final Progress p, final int segmentCount) {
      if (segmentCount == 0) {
        return 0;
      }
      final String row = p.records.get(segmentCount);
      return Long.parseLong(row.substring(0, row.indexOf(' ')));
    }

    private void compactSegments(final DiskBudget disk, final Progress p) throws IOException {
      // Four adjacent spans of the same size form one larger span.
      // Leave all data loaded from an earlier invocation untouched.
      final int fanIn = 4;
      while (p.segments.size() >= fanIn) {
        final int end = p.segments.size();
        final int start = end - fanIn;
        final long stride = cursor(p, end) - cursor(p, end - 1);
        for (int i = start; i < end; ++i) {
          if (!mWritten.contains(p.segments.get(i).path) || cursor(p, i + 1) - cursor(p, i) != stride) {
            return;
          }
        }
        final List<OrbitFile> previous = new ArrayList<>(p.segments.subList(start, end));
        final OrbitFile merged = mergeRuns(disk, previous);
        final String check = " " + merged.length + " " + Files.size(merged.path) + " " + digest(merged.path, disk);
        final OrbitFile copy = retain(merged, disk);
        p.segments.subList(start, end).clear();
        p.segments.add(copy);
        p.records.subList(start + 1, end + 1).clear();
        p.records.add(p.done + " " + p.last + " " + p.offset + " " + copy.path.getFileName() + check);
        mWritten.add(copy.path);
        // Publish first so that an interruption cannot lose a span.
        publishSegments(p);
        for (final OrbitFile f : previous) {
          final long size = Files.size(f.path);
          Files.delete(f.path);
          synchronized (disk) {
            disk.mRetained -= size;
          }
          mWritten.remove(f.path);
        }
      }
    }

    private OrbitFile seal(final DiskBudget disk, final Progress p, final OrbitFile merged) throws IOException {
      if (p.segments.size() < 2 || !COMPACT_SEGMENTS || merged.length < (1 << 20)) {
        return merged;
      }
      final String check = " " + merged.length + " " + Files.size(merged.path) + " " + digest(merged.path, disk);
      final OrbitFile copy = retain(merged, disk);
      final List<OrbitFile> previous = new ArrayList<>(p.segments);
      p.segments.clear();
      p.segments.add(copy);
      p.records.subList(1, p.records.size()).clear();
      p.records.add(p.done + " " + p.last + " " + p.offset + " " + copy.path.getFileName() + check);
      mWritten.add(copy.path);
      // The merge is complete, but this is not yet a distance layer:
      // the final old/current exclusion and weighted count still run.
      publishSegments(p);
      for (final OrbitFile f : previous) {
        if (mWritten.remove(f.path)) {
          final long size = Files.size(f.path);
          Files.delete(f.path);
          synchronized (disk) {
            disk.mRetained -= size;
          }
        }
      }
      System.out.printf("Saved merged candidate set of %,d representatives%n", copy.length);
      return copy;
    }

    private void discardNewSegments(final DiskBudget disk, final Progress p) throws IOException {
      // A successfully committed new layer no longer needs its
      // candidate runs. Only delete files created in this invocation.
      for (final OrbitFile f : p.segments) {
        if (mWritten.remove(f.path)) {
          final long size = Files.size(f.path);
          Files.delete(f.path);
          disk.mRetained -= size;
        }
      }
      Files.deleteIfExists(p.path);
    }

    private OrbitFile retain(final OrbitFile file, final DiskBudget disk) throws IOException {
      if (file.path.getParent().equals(mRoot)) {
        return file;
      }
      final long size = Files.size(file.path);
      final Path dest = Files.createTempFile(mRoot, "layer-", ".bin");
      try {
        Files.move(file.path, dest, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
      } catch (final IOException | RuntimeException e) {
        Files.deleteIfExists(dest);
        throw e;
      }
      synchronized (disk) {
        if (!disk.mFiles.remove(file.path)) {
          throw new IOException("Cannot retain an unowned scratch file");
        }
        disk.mLive -= size;
        disk.mRetained += size;
      }
      return new OrbitFile(dest, file.length);
    }

    List<OrbitFile> save(final int n, final DiskBudget disk, final List<Long> result,
                         final OrbitFile old, final OrbitFile now) throws IOException {
      final OrbitFile a = retain(old, disk);
      final OrbitFile b = retain(now, disk);
      final Path stage = Files.createTempFile(mRoot, "manifest-", ".tmp");
      try {
        final StringBuilder counts = new StringBuilder();
        for (final long v : result) {
          if (counts.length() != 0) {
            counts.append(' ');
          }
          counts.append(v);
        }
        Files.write(stage, List.of("row-census-v1 " + n, describe(a, disk), describe(b, disk), counts.toString()));
        Files.move(stage, mState, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
      } finally {
        if (Files.exists(stage, LinkOption.NOFOLLOW_LINKS)) {
          Files.delete(stage);
        }
      }
      // This is an earlier layer written by this invocation. Keep any
      // checkpoint loaded from a prior invocation, unless it was replaced
      // during this invocation; this never deletes pre-existing user files.
      for (final OrbitFile f : mSaved) {
        if (!f.path.equals(a.path) && !f.path.equals(b.path)) {
          if (disk.owns(f)) {
            throw new IOException("Unexpected scratch layer in checkpoint");
          }
          if (mWritten.contains(f.path)) {
            final long size = Files.size(f.path);
            Files.delete(f.path);
            mWritten.remove(f.path);
            disk.mRetained -= size;
          }
        }
      }
      if (a != old) {
        mWritten.add(a.path);
      }
      if (b != now) {
        mWritten.add(b.path);
      }
      mSaved = List.of(a, b);
      return mSaved;
    }
  }

  private static final class OrbitWriter implements AutoCloseable {
    private final DiskBudget mDisk;
    private final DataOutputStream mStream;
    private final byte[] mBuffer = new byte[1 << 16];
    private int mSize;
    private boolean mFirst = true;
    private long mPrevious;

    OrbitWriter(final DiskBudget budget, final Path path) throws IOException {
      mDisk = budget;
      mStream = new DataOutputStream(Files.newOutputStream(path));
    }

    private void flush() throws IOException {
      if (mSize != 0) {
        mDisk.addBytes(mSize);
        mStream.write(mBuffer, 0, mSize);
        mSize = 0;
      }
    }

    private void emit(final int b) throws IOException {
      if (mSize == mBuffer.length) {
        flush();
      }
      mBuffer[mSize++] = (byte) b;
    }

    void write(final long key) throws IOException {
      if (mFirst) {
        for (int i = Long.SIZE - Byte.SIZE; i >= 0; i -= Byte.SIZE) {
          emit((int) (key >>> i));
        }
        mFirst = false;
      } else {
        if (key <= mPrevious) {
          throw new IllegalStateException("Orbit file must be strictly sorted");
        }
        long delta = key - mPrevious;
        while ((delta & ~127L) != 0) {
          emit((int) (delta & 127) | 128);
          delta >>>= 7;
        }
        emit((int) delta);
      }
      mPrevious = key;
    }

    @Override
    public void close() throws IOException {
      try {
        flush();
      } finally {
        mStream.close();
      }
    }
  }

  private static OrbitFile mergeRuns(final DiskBudget disk, final List<OrbitFile> runs) throws IOException {
    if (runs.size() == 1) {
      return runs.get(0);
    }
    final Path path = disk.file();
    long length = 0;
    final List<OrbitReader> readers = new ArrayList<>();
    final PriorityQueue<OrbitReader> heap = new PriorityQueue<>(Comparator.comparingLong(r -> r.mHead));
    try (OrbitWriter out = new OrbitWriter(disk, path)) {
      for (final OrbitFile f : runs) {
        final OrbitReader r = new OrbitReader(f);
        readers.add(r);
        if (r.mPresent) {
          heap.add(r);
        }
      }
      long prev = 0;
      long processed = 0;
      while (!heap.isEmpty()) {
        if ((processed++ & 65535) == 0) {
          disk.checkTime();
        }
        final OrbitReader r = heap.remove();
        final long x = r.mHead;
        if (length == 0 || x != prev) {
          out.write(x);
          prev = x;
          ++length;
        }
        r.advance();
        if (r.mPresent) {
          heap.add(r);
        }
      }
    } finally {
      for (final OrbitReader r : readers) {
        r.close();
      }
    }
    for (final OrbitFile f : runs) {
      if (disk.owns(f)) {
        disk.release(f);
      }
    }
    return new OrbitFile(path, length);
  }

  private static OrbitFile mergeSegments(final DiskBudget disk, final List<OrbitFile> runs, final int workers)
      throws IOException, InterruptedException {
    List<OrbitFile> level = runs;
    while (level.size() > RunBuilder.FAN_IN) {
      final List<OrbitFile> next = new ArrayList<>();
      final ExecutorService pool = Executors.newFixedThreadPool(workers);
      final ArrayDeque<Future<OrbitFile>> queue = new ArrayDeque<>();
      try {
        for (int from = 0; from < level.size(); from += RunBuilder.FAN_IN) {
          final List<OrbitFile> group = level.subList(from, Math.min(level.size(), from + RunBuilder.FAN_IN));
          queue.addLast(pool.submit(() -> mergeRuns(disk, group)));
          if (queue.size() == workers) {
            next.add(queue.removeFirst().get());
          }
        }
        while (!queue.isEmpty()) {
          next.add(queue.removeFirst().get());
        }
      } catch (final ExecutionException e) {
        if (e.getCause() instanceof RuntimeException) {
          throw (RuntimeException) e.getCause();
        }
        throw new IOException("Census merge failed", e.getCause());
      } finally {
        pool.shutdownNow();
        if (!pool.awaitTermination(30, TimeUnit.SECONDS)) {
          throw new IOException("Census merge workers did not stop");
        }
      }
      level = next;
    }
    return mergeRuns(disk, level);
  }

  private static OrbitFile unvisitedCandidates(final DiskBudget disk, final OrbitFile candidates,
                                              final OrbitFile old, final OrbitFile current) throws IOException {
    final Path path = disk.file();
    long size = 0;
    try (OrbitReader in = new OrbitReader(candidates); OrbitReader prev = new OrbitReader(old);
         OrbitReader now = new OrbitReader(current); OrbitWriter out = new OrbitWriter(disk, path)) {
      long used = 0;
      while (in.mPresent) {
        if ((used++ & 65535) == 0) {
          disk.checkTime();
        }
        final long x = in.mHead;
        if (!prev.seek(x) && !now.seek(x)) {
          out.write(x);
          ++size;
        }
        in.advance();
      }
    }
    disk.release(candidates);
    return new OrbitFile(path, size);
  }

  private static final class RunBuilder {
    private static final int FAN_IN = 16;
    private final DiskBudget mDisk;
    private final long[] mBuffer;
    private final List<List<OrbitFile>> mTiers = new ArrayList<>();
    private int mSize;

    RunBuilder(final DiskBudget disk, final int chunk) {
      mDisk = disk;
      mBuffer = new long[chunk];
    }

    void push(final long x) throws IOException {
      mBuffer[mSize++] = x;
      if (mSize == mBuffer.length) {
        flush();
      }
    }

    private void flush() throws IOException {
      if (mSize == 0) {
        return;
      }
      Arrays.sort(mBuffer, 0, mSize);
      final Path p = mDisk.file();
      long len = 0;
      try (OrbitWriter out = new OrbitWriter(mDisk, p)) {
        for (int i = 0; i < mSize; ++i) {
          if (i == 0 || mBuffer[i] != mBuffer[i - 1]) {
            out.write(mBuffer[i]);
            ++len;
          }
        }
      }
      mSize = 0;
      OrbitFile f = new OrbitFile(p, len);
      for (int j = 0; ; ++j) {
        if (j == mTiers.size()) {
          mTiers.add(new ArrayList<>());
        }
        final List<OrbitFile> tier = mTiers.get(j);
        tier.add(f);
        if (tier.size() < FAN_IN) {
          break;
        }
        f = mergeRuns(mDisk, tier);
        tier.clear();
      }
    }

    OrbitFile finish() throws IOException {
      flush();
      final List<OrbitFile> merged = new ArrayList<>();
      for (final List<OrbitFile> tier : mTiers) {
        if (!tier.isEmpty()) {
          merged.add(mergeRuns(mDisk, tier));
        }
      }
      return mergeRuns(mDisk, merged);
    }
  }

  // Exact disk-backed BFS. The candidates are sorted and deduplicated,
  // then the preceding two layers are removed by a streaming set difference.
  private long packDiskKey(final long x) {
    long z = 0;
    for (int j = 0; j < mN; ++j) {
      z |= (x >>> (8 * j) & mMask) << (mN * j);
    }
    return z;
  }

  private long unpackDiskKey(final long z) {
    long x = 0;
    for (int j = 0; j < mN; ++j) {
      x |= (z >>> (mN * j) & mMask) << (8 * j);
    }
    return x;
  }

  private void generateExternal(final DiskBudget disk, final OrbitReader in, final RunBuilder runs,
                                final Checkpoint.Progress p, final long end) throws IOException {
    while (in.mPresent && p.done < end) {
      if ((p.done & 4095) == 0) {
        disk.checkTime();
      }
      emitNeighbours(in.mHead, runs);
      p.last = in.mHead;
      p.offset = in.mOffset;
      ++p.done;
      in.advance();
    }
  }

  private void emitNeighbours(final long key, final RunBuilder runs) throws IOException {
    final long x = unpackDiskKey(key);
    final long qi = inverse(x);
    for (int from = 0; from < mN; ++from) {
      for (int to = 0; to < mN; ++to) {
        if (from != to) {
          canonical(rowAdd(x, from, to), colAdd(qi, to, from));
          runs.push(packDiskKey(mRepresentative));
          if (x != mIdentity) {
            canonical(colAdd(x, from, to), rowAdd(qi, to, from));
            runs.push(packDiskKey(mRepresentative));
          }
        }
      }
    }
  }

  private static final class Batch {
    final Future<OrbitFile> run;
    final long end;
    final long last;
    final long offset;

    Batch(final Future<OrbitFile> run, final long end, final long last, final long offset) {
      this.run = run;
      this.end = end;
      this.last = last;
      this.offset = offset;
    }
  }

  private void parallelBatches(final DiskBudget disk, final OrbitFile old, final OrbitFile current,
                               final Checkpoint checkpoint, final Checkpoint.Progress progress,
                               final int chunk, final int slice, final int workers, final int depth)
      throws IOException, InterruptedException {
    final ExecutorService pool = Executors.newFixedThreadPool(workers);
    final ArrayDeque<Batch> queue = new ArrayDeque<>();
    long read = progress.done;
    try (OrbitReader in = new OrbitReader(current, progress.done, progress.last, progress.offset)) {
      while (read < current.length || !queue.isEmpty()) {
        while (queue.size() < workers && read < current.length) {
          disk.checkTime();
          final long[] keys = new long[(int) Math.min(slice, current.length - read)];
          long last = 0;
          long offset = 0;
          for (int i = 0; i < keys.length; ++i) {
            if (!in.mPresent) {
              throw new IOException("Did not read the complete predecessor batch");
            }
            keys[i] = in.mHead;
            last = in.mHead;
            offset = in.mOffset;
            in.advance();
          }
          read += keys.length;
          final Future<OrbitFile> f = pool.submit(() -> {
            final BinaryRowReductionCensus worker = new BinaryRowReductionCensus(mN, 1);
            final RunBuilder runs = new RunBuilder(disk, chunk);
            for (int i = 0; i < keys.length; ++i) {
              if ((i & 2047) == 0) {
                disk.checkTime();
              }
              worker.emitNeighbours(keys[i], runs);
            }
            final OrbitFile sorted = runs.finish();
            return DEFER_FILTER ? sorted : unvisitedCandidates(disk, sorted, old, current);
          });
          queue.addLast(new Batch(f, read, last, offset));
        }
        final Batch next = queue.removeFirst();
        final OrbitFile file;
        try {
          file = next.run.get();
        } catch (final ExecutionException e) {
          final Throwable cause = e.getCause();
          if (cause instanceof RuntimeException) {
            throw (RuntimeException) cause;
          }
          throw new IOException("Batch failed", cause);
        }
        progress.done = next.end;
        progress.last = next.last;
        progress.offset = next.offset;
        checkpoint.saveSegment(disk, progress, file);
        System.out.printf("Saved depth %d at %,d/%,d predecessors%n", depth, progress.done, current.length);
      }
    } finally {
      pool.shutdownNow();
      if (!pool.awaitTermination(30, TimeUnit.SECONDS)) {
        throw new IOException("External census workers did not stop");
      }
    }
  }

  private int retainedWeight(final long key) {
    final long matrix = unpackDiskKey(key);
    canonical(matrix, inverse(matrix));
    if (mRepresentative != matrix) {
      throw new IllegalStateException("noncanonical retained representative");
    }
    return mWeight;
  }

  private final class WeightedKeys implements AutoCloseable {
    private static final int BATCH_SIZE = 65536;
    private final DiskBudget mDisk;
    private final ExecutorService mPool;
    private final ArrayDeque<Future<Long>> mPending = new ArrayDeque<>();
    private final int mWorkers;
    private long[] mKeys;
    private int mLength;
    private long mTotal;

    WeightedKeys(final DiskBudget disk, final int workers) {
      mDisk = disk;
      mWorkers = workers;
      mPool = workers == 1 ? null : Executors.newFixedThreadPool(workers);
      mKeys = mPool == null ? null : new long[BATCH_SIZE];
    }

    private void collect() throws IOException, InterruptedException {
      try {
        mTotal = Math.addExact(mTotal, mPending.removeFirst().get());
      } catch (final ExecutionException e) {
        final Throwable cause = e.getCause();
        if (cause instanceof RuntimeException) {
          throw (RuntimeException) cause;
        }
        throw new IOException("Weighted census batch failed", cause);
      }
    }

    private void submit() throws IOException, InterruptedException {
      final long[] keys = mKeys;
      final int length = mLength;
      if (mPending.size() == mWorkers) {
        collect();
      }
      mPending.addLast(mPool.submit(() -> {
        final BinaryRowReductionCensus worker = new BinaryRowReductionCensus(mN, 1);
        long weight = 0;
        for (int i = 0; i < length; ++i) {
          if ((i & 4095) == 0) {
            mDisk.checkTime();
          }
          weight = Math.addExact(weight, worker.retainedWeight(keys[i]));
        }
        return weight;
      }));
      mKeys = new long[BATCH_SIZE];
      mLength = 0;
    }

    void add(final long key) throws IOException, InterruptedException {
      if (mPool == null) {
        mTotal = Math.addExact(mTotal, retainedWeight(key));
      } else {
        mKeys[mLength++] = key;
        if (mLength == BATCH_SIZE) {
          submit();
        }
      }
    }

    long finish() throws IOException, InterruptedException {
      if (mLength != 0) {
        submit();
      }
      while (!mPending.isEmpty()) {
        collect();
      }
      return mTotal;
    }

    @Override
    public void close() throws InterruptedException, IOException {
      if (mPool != null) {
        mPool.shutdownNow();
        if (!mPool.awaitTermination(30, TimeUnit.SECONDS)) {
          throw new IOException("Weighted census workers did not stop");
        }
      }
    }
  }

  private List<Long> runExternal(final int maxDistance, final DiskBudget disk, final int chunk,
                                 final Checkpoint checkpoint, final long slice, final int workers)
      throws IOException, InterruptedException {
    return runExternal(maxDistance, disk, chunk, checkpoint, slice, workers, true);
  }

  private List<Long> runExternal(final int maxDistance, final DiskBudget disk, final int chunk,
                                 final Checkpoint checkpoint, final long slice, final int workers, final boolean truncate)
      throws IOException, InterruptedException {
    System.out.println("Scratch directory: " + disk.mDir);
    final List<Long> result = checkpoint == null ? new ArrayList<>() : checkpoint.read(mN, disk);
    OrbitFile old;
    OrbitFile current;
    if (result.isEmpty()) {
      result.add(1L);
      old = new OrbitFile(disk.file(), 0);
      current = new OrbitFile(disk.file(), 1);
      try (OrbitWriter out = new OrbitWriter(disk, current.path)) {
        out.write(packDiskKey(mIdentity));
      }
      System.out.printf("%d 0 1 1%n", mN);
      if (checkpoint != null) {
        final List<OrbitFile> saved = checkpoint.save(mN, disk, result, old, current);
        old = saved.get(0);
        current = saved.get(1);
      }
    } else {
      old = checkpoint.mSaved.get(0);
      current = checkpoint.mSaved.get(1);
      System.out.printf("Resuming dimension %d after complete depth %d%n", mN, result.size() - 1);
      if (result.size() > maxDistance + 1L) {
        return truncate ? result.subList(0, maxDistance + 1) : result;
      }
    }
    for (int d = result.size(); d <= maxDistance; ++d) {
      final long start = System.nanoTime();
      final Checkpoint.Progress progress = slice == 0
        ? new Checkpoint.Progress(null, "") : checkpoint.readSegments(disk, old, current);
      final OrbitFile candidates;
      if (slice == 0) {
        final RunBuilder runs = new RunBuilder(disk, chunk);
        try (OrbitReader in = new OrbitReader(current)) {
          generateExternal(disk, in, runs, progress, current.length);
        }
        candidates = runs.finish();
      } else {
        if (progress.done != 0) {
          System.out.printf("Resuming depth %d at %,d/%,d predecessors%n", d, progress.done, current.length);
        }
        if (workers > 1) {
          parallelBatches(disk, old, current, checkpoint, progress, chunk, (int) slice, workers, d);
        } else try (OrbitReader in = new OrbitReader(current, progress.done, progress.last, progress.offset)) {
          while (progress.done < current.length) {
            disk.checkTime();
            final RunBuilder runs = new RunBuilder(disk, chunk);
            final long end = progress.done + Math.min(slice, current.length - progress.done);
            generateExternal(disk, in, runs, progress, end);
            if (progress.done != end) {
              throw new IOException("Did not read the complete predecessor batch");
            }
            // The final merge always filters against both prior layers.
            // Mixing early-filtered and unfiltered runs gives the same set.
            final OrbitFile sorted = runs.finish();
            checkpoint.saveSegment(disk, progress,
              DEFER_FILTER ? sorted : unvisitedCandidates(disk, sorted, old, current));
            System.out.printf("Saved depth %d at %,d/%,d predecessors%n", d, progress.done, current.length);
          }
        }
        candidates = checkpoint.seal(disk, progress, mergeSegments(disk, progress.segments, workers));
      }
      final Path next = disk.file();
      long len = 0;
      final long total;
      try (OrbitReader pot = new OrbitReader(candidates); OrbitReader prev = new OrbitReader(old);
           OrbitReader now = new OrbitReader(current); OrbitWriter out = new OrbitWriter(disk, next);
           WeightedKeys weights = new WeightedKeys(disk, candidates.length > (1 << 20) ? workers : 1)) {
        long processed = 0;
        while (pot.mPresent) {
          if ((processed++ & 65535) == 0) {
            disk.checkTime();
          }
          final long x = pot.mHead;
          if (!prev.seek(x) && !now.seek(x)) {
            weights.add(x);
            out.write(x);
            ++len;
          }
          pot.advance();
        }
        total = weights.finish();
      }
      if (disk.owns(candidates)) {
        disk.release(candidates);
      }
      if (checkpoint == null) {
        disk.release(old);
      }
      old = current;
      current = new OrbitFile(next, len);
      if (len == 0) {
        disk.release(current);
        if (slice != 0) {
          checkpoint.discardNewSegments(disk, progress);
        }
        break;
      }
      result.add(total);
      if (checkpoint != null) {
        final List<OrbitFile> saved = checkpoint.save(mN, disk, result, old, current);
        old = saved.get(0);
        current = saved.get(1);
        if (slice != 0) {
          checkpoint.discardNewSegments(disk, progress);
        }
      }
      System.out.printf("%d %d %d %d %.3fs%n", mN, d, total, len, (System.nanoTime() - start) / 1e9);
    }
    if (checkpoint == null) {
      disk.release(old);
      if (current.length != 0) {
        disk.release(current);
      }
    }
    return result;
  }
  private static void benchmarkRead(final Path input, final long count) throws IOException {
    if (count < 65536 || count > 150_000_000L) {
      throw new IllegalArgumentException("Expected 65536..150000000 keys");
    }
    final OrbitFile f = new OrbitFile(input, count);
    long last = 0;
    long offset = 0;
    final int first = 65536;
    try (OrbitReader a = new OrbitReader(f, 0, 0, 0, false);
         OrbitReader b = new OrbitReader(f, 0, 0, 0, true)) {
      for (int j = 0; j < first; ++j) {
        if (a.mHead != b.mHead || a.mOffset != b.mOffset) {
          throw new AssertionError("Input or offset mismatch at " + j);
        }
        last = b.mHead;
        offset = b.mOffset;
        a.advance();
        b.advance();
      }
      if (count > first) {
        try (OrbitReader resumed = new OrbitReader(f, first, last, offset, true)) {
          if (resumed.mHead != b.mHead || resumed.mOffset != b.mOffset) {
            throw new AssertionError("Resume cursor mismatch");
          }
        }
      }
    }
    long reference = 0;
    for (int pass = 0; pass < 4; ++pass) {
      final boolean bulk = pass == 1 || pass == 2;
      final long start = System.nanoTime();
      long digest = 0;
      try (OrbitReader in = new OrbitReader(f, 0, 0, 0, bulk)) {
        while (in.mPresent) {
          digest = Long.rotateLeft(digest, 7) ^ in.mHead;
          in.advance();
        }
        System.out.printf("%s: %,d keys, %,d bytes, %.3fs, checksum %016x%n", bulk ? "bulk" : "reference",
          count, in.mOffset, (System.nanoTime() - start) / 1e9, digest);
      }
      if (pass == 0) {
        reference = digest;
      } else if (digest != reference) {
        throw new AssertionError("Reader checksum mismatch");
      }
    }
  }

  public static void main(final String[] args) throws Exception {
    if (args.length == 3 && "--bench-reader".equals(args[0])) {
      benchmarkRead(Path.of(args[1]), Long.parseLong(args[2]));
      return;
    }
    if (args.length > 0 && "--external".equals(args[0])) {
      if (args.length < 9 || args.length > 12) {
        throw new IllegalArgumentException("Expected --external n depth scratch-dir chunk disk-MiB seconds (b-file or -) offset [checkpoint-dir [parents-per-batch [workers]]]");
      }
      final int n = Integer.parseInt(args[1]);
      final int depth = Integer.parseInt(args[2]);
      final int chunk = Integer.parseInt(args[4]);
      final long space = Long.parseLong(args[5]);
      final long seconds = Long.parseLong(args[6]);
      final long slice = args.length >= 11 ? Long.parseLong(args[10]) : 0;
      final int workers = args.length == 12 ? Integer.parseInt(args[11]) : 1;
      if (n < 1 || n > 8 || depth < 0 || chunk < 16 || chunk > (1 << 22) || space < 1
        || space > (1L << 25) || seconds < 1 || seconds > 7L * 24 * 3600
        || args.length >= 11 && slice < 1 || workers < 1 || workers > 8
        || workers > 1 && (slice > (1 << 20) || chunk > (1 << 20))) {
        throw new IllegalArgumentException("Invalid external census configuration");
      }
      final List<Long> computed;
      try (DiskBudget disk = new DiskBudget(Path.of(args[3]), space << 20, seconds);
           Checkpoint checkpoint = args.length >= 10 ? new Checkpoint(Path.of(args[9])) : null) {
        computed = new BinaryRowReductionCensus(n, 1).runExternal(depth, disk, chunk, checkpoint, slice, workers);
      }
      final int begin = Integer.parseInt(args[8]);
      if ("-".equals(args[7])) {
        for (int j = 0; j < computed.size(); ++j) {
          System.out.printf("%d %d%n", begin + j, computed.get(j));
        }
        return;
      }
      final List<Long> reference = new ArrayList<>();
      for (final String line : Files.readAllLines(Path.of(args[7]))) {
        if (line.strip().matches("[0-9]+\\s+[0-9]+")) {
          reference.add(Long.parseLong(line.strip().split("\\s+")[1]));
        }
      }
      int at = begin;
      for (final long value : computed) {
        if (value != reference.get(at)) {
          throw new AssertionError("Mismatch at flat index " + at + ": " + value + " != " + reference.get(at));
        }
        ++at;
      }
      System.out.printf("Matched A381854 indices %d..%d (external)%n", begin, at - 1);
      return;
    }
    final int n = Integer.parseInt(args[0]);
    final int maxDistance = Integer.parseInt(args[1]);
    final int limit = Integer.parseInt(args[2]);
    if (n < 1 || n > 8 || limit < 1 || limit > 200_000_000) {
      throw new IllegalArgumentException("Expected n=1..8 and at most 200,000,000 orbits per layer");
    }
    if (args.length == 3) {
      new BinaryRowReductionCensus(n, limit).run(maxDistance);
      return;
    }
    final List<Long> expected = new ArrayList<>();
    for (final String line : Files.readAllLines(Path.of(args[3]))) {
      if (line.strip().matches("[0-9]+\\s+[0-9]+")) {
        expected.add(Long.parseLong(line.strip().split("\\s+")[1]));
      }
    }
    int at = args.length > 4 ? Integer.parseInt(args[4]) : 1;
    final int bits = args.length > 5 ? Integer.parseInt(args[5]) : 4;
    final int workers = args.length > 6 ? Integer.parseInt(args[6]) : 1;
    if (workers < 1 || workers > 2 || workers > 1 && bits >= 0) {
      throw new IllegalArgumentException("Two workers are only supported for compressed terminal layers");
    }
    if (!(bits >= 4 && bits <= 27 || bits <= -4 && bits >= -28)) {
      throw new IllegalArgumentException("Invalid preallocated terminal-layer capacity");
    }
    final int begin = at == 1 ? 1 : n; // n=0, d=0 is the initial 1.
    final int original = at;
    for (int k = begin; k <= n; ++k) {
      final int capacity = k == n && bits < 0 ? bits : 1 << (k == n ? bits : 4);
      for (final long value : new BinaryRowReductionCensus(k, limit, capacity, workers).run(k == n ? maxDistance : Integer.MAX_VALUE)) {
        if (value != expected.get(at)) {
          throw new AssertionError("Mismatch at flat index " + at + ": " + value + " != " + expected.get(at));
        }
        ++at;
      }
    }
    System.out.printf("Matched A381854 indices %d..%d%n", original, at - 1);
  }
}
