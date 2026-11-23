package irvine.math.graph;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

/**
 * Exhaustive compatibility-matrix audit for the published Wang-square range.
 * @author Gregory Morse
 */
public final class WangSquareCensus {

  private static final int CEILING = 18;

  private WangSquareCensus() {
  }

  private static final class Codes {
    private long[] mData = new long[32];
    private int mSize;

    private void add(final long code) {
      if (mSize == mData.length) {
        mData = Arrays.copyOf(mData, mSize * 2);
      }
      mData[mSize++] = code;
    }

    private long[] sorted() {
      final long[] codes = Arrays.copyOf(mData, mSize);
      Arrays.sort(codes);
      for (int i = 1; i < codes.length; ++i) {
        if (codes[i] == codes[i - 1]) {
          throw new IllegalStateException("Duplicate compatibility relation");
        }
      }
      return codes;
    }
  }

  // Colors with both kinds of port give complete bipartite blocks.
  // Every one-sided color can be replaced by the zero row/column class.
  private static void incoming(final int[] out, final int[] masks, final int used, final int groups,
                               final int col, final int least, final Codes codes) {
    final int n = out.length;
    if (col == n) {
      if (used == (1 << groups + 1) - 2) {
        long relation = 0;
        for (int i = 0; i < n; ++i) {
          relation |= (long) masks[out[i]] << n * i;
        }
        codes.add(relation);
      }
      return;
    }
    for (int c = least; c <= groups; ++c) {
      masks[c] |= c == 0 ? 0 : 1 << col;
      incoming(out, masks, used | (c == 0 ? 0 : 1 << c), groups, col + 1, least, codes);
      masks[c] ^= c == 0 ? 0 : 1 << col;
    }
  }

  private static void outgoing(final int[] colors, final int groups, final int row, final int least, final Codes codes) {
    if (row == colors.length) {
      incoming(colors, new int[groups + 1], 0, groups, 0, least, codes);
      return;
    }
    for (int c = least; c <= groups + 1; ++c) {
      colors[row] = c;
      outgoing(colors, Math.max(groups, c), row + 1, least, codes);
    }
  }

  private static long transpose(final long relation, final int n) {
    long result = 0;
    for (long b = relation; b != 0; b &= b - 1) {
      final int i = Long.numberOfTrailingZeros(b);
      result |= 1L << (i % n * n + i / n);
    }
    return result;
  }

  private static void label(final long[] codes, final int[] ids, final long relation, final int orbit) {
    final int j = Arrays.binarySearch(codes, relation);
    if (j < 0 || ids[j] >= 0 && ids[j] != orbit) {
      throw new IllegalStateException("Invalid relation orbit");
    }
    ids[j] = orbit;
  }

  private static void permute(final long code, final int[] permutation, final int used, final int at,
                              final long[] codes, final int[] ids, final int orbit) {
    final int n = permutation.length;
    if (at == n) {
      long rel = 0;
      for (long b = code; b != 0; b &= b - 1) {
        final int i = Long.numberOfTrailingZeros(b);
        rel |= 1L << (n * permutation[i / n] + permutation[i % n]);
      }
      label(codes, ids, rel, orbit);
      label(codes, ids, transpose(rel, n), orbit);
      return;
    }
    for (int choices = ((1 << n) - 1) & ~used; choices != 0; choices &= choices - 1) {
      final int one = Integer.lowestOneBit(choices);
      permutation[at] = Integer.numberOfTrailingZeros(one);
      permute(code, permutation, used | one, at + 1, codes, ids, orbit);
    }
  }

  private static final class Axis {
    private final long mCode;
    private final int mOrbit;
    private final int[] mForward;
    private final int[] mBackward;
    private final int[] mMutual;

    private Axis(final long code, final long reflect, final int orbit, final int n) {
      mCode = code;
      mOrbit = orbit;
      mForward = new int[n];
      mBackward = new int[n];
      mMutual = new int[n];
      final int all = (1 << n) - 1;
      for (int j = 0; j < n; ++j) {
        mForward[j] = (int) (code >>> (n * j)) & all;
        mBackward[j] = (int) (reflect >>> (n * j)) & all;
        mMutual[j] = mForward[j] & mBackward[j];
      }
    }
  }

  private static boolean diagonal(final int[] x, final int[] y) {
    for (int live = (1 << x.length) - 1; live != 0;) {
      int keep = 0;
      for (int j = live; j != 0; j &= j - 1) {
        final int i = Integer.numberOfTrailingZeros(j);
        if ((x[i] & y[i] & live) != 0) {
          keep |= 1 << i;
        }
      }
      if (keep == live) {
        return true;
      }
      live = keep;
    }
    return false;
  }

  private static boolean square2(final Axis h, final Axis v, final boolean torus) {
    final int[] x = torus ? h.mMutual : h.mForward;
    final int[] y = torus ? v.mMutual : v.mForward;
    for (int a = 0; a < x.length; ++a) {
      for (int right = x[a]; right != 0; right &= right - 1) {
        for (int down = y[a]; down != 0; down &= down - 1) {
          if ((x[Integer.numberOfTrailingZeros(down)] & y[Integer.numberOfTrailingZeros(right)]) != 0) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private static final class Search {
    private final int mN;
    private final int mFull;
    private final int[][] mFollow;
    private final int[] mRings = new int[1601];
    private final int[] mKept = new int[1601];
    private int mLength;
    private int mWork;

    private Search(final int n) {
      mN = n;
      mFull = (1 << n) - 1;
      mFollow = new int[4][mFull + 1];
    }

    private void ring(final int[] h, final int width, final int first, final int last, final int path, final int size) {
      if (size == width) {
        if (mLength < mRings.length && (h[last] & (1 << first)) != 0) {
          mRings[mLength++] = path;
        }
      } else {
        for (int bits = h[last]; bits != 0 && mLength < mRings.length; bits &= bits - 1) {
          final int next = Integer.numberOfTrailingZeros(bits);
          ring(h, width, first, next, path | (next << (3 * size)), size + 1);
        }
      }
    }

    private boolean periodic(final Axis h, final Axis v, final int width) {
      mLength = 0;
      for (int i = 0; i < mN; ++i) {
        ring(h.mForward, width, i, i, i, 1);
      }
      if (mLength >= mRings.length) {
        return false; // This is only a shortcut, never a rejection.
      }
      for (int l = mLength; l > 0;) {
        int next = 0;
        for (int i = 0; i < l; ++i) {
          final int row = mRings[i];
          for (int j = 0; j < l; ++j) {
            int a = row;
            int b = mRings[j];
            int k = 0;
            while (k++ < width && (v.mForward[a & 7] & (1 << (b & 7))) != 0) {
              a >>>= 3;
              b >>>= 3;
            }
            if (k > width) {
              mKept[next++] = row;
              break;
            }
          }
        }
        if (next == l) {
          return true;
        }
        System.arraycopy(mKept, 0, mRings, 0, next);
        l = next;
      }
      return false;
    }

    private void setup(final Axis h, final Axis v) {
      final int[][] options = {h.mForward, h.mBackward, v.mForward, v.mBackward};
      for (int d = 0; d < options.length; ++d) {
        final int[] union = mFollow[d];
        for (int b = 1; b <= mFull; ++b) {
          union[b] = union[b & (b - 1)] | options[d][Integer.numberOfTrailingZeros(b)];
        }
      }
    }

    private int domains(final int[] dom, final int side) {
      boolean changed;
      do {
        if (--mWork < 0) {
          return -1;
        }
        changed = false;
        for (int p = 0; p < dom.length; ++p) {
          int keep = dom[p];
          if (p % side != 0) {
            keep &= mFollow[0][dom[p - 1]];
          }
          if (p % side + 1 < side) {
            keep &= mFollow[1][dom[p + 1]];
          }
          if (p >= side) {
            keep &= mFollow[2][dom[p - side]];
          }
          if (p + side < dom.length) {
            keep &= mFollow[3][dom[p + side]];
          }
          if (keep == 0) {
            return 0;
          }
          changed |= keep != dom[p];
          dom[p] = keep;
        }
      } while (changed);
      int best = -1;
      int size = mN + 1;
      int depth = -1;
      for (int p = 0; p < dom.length; ++p) {
        final int c = Integer.bitCount(dom[p]);
        if (c > 1 && c <= size) {
          final int x = p % side, y = p / side;
          final int d = Math.min(Math.min(x, y), Math.min(side - 1 - x, side - 1 - y));
          if (c < size || d > depth) {
            best = p;
            size = c;
            depth = d;
          }
        }
      }
      if (best < 0) {
        return 1;
      }
      for (int bits = dom[best]; bits != 0; bits &= bits - 1) {
        final int[] next = dom.clone();
        next[best] = Integer.lowestOneBit(bits);
        final int result = domains(next, side);
        if (result != 0) {
          return result;
        }
      }
      return 0;
    }

    private int smallBoard(final int side, final int work) {
      final int[] dom = new int[side * side];
      Arrays.fill(dom, mFull);
      mWork = work;
      return domains(dom, side);
    }

    private void clauses(final ISolver sat, final int src, final int dest, final int d) throws ContradictionException {
      for (int a = 0; a < mN; ++a) {
        final VecInt clause = new VecInt();
        clause.push(-(src * mN + a + 1));
        for (int b = mFollow[d][1 << a]; b != 0; b &= b - 1) {
          clause.push(dest * mN + Integer.numberOfTrailingZeros(b) + 1);
        }
        sat.addClause(clause);
      }
    }

    private boolean satBoard(final int side) {
      final int cells = side * side;
      final ISolver sat = SolverFactory.newDefault();
      sat.newVar(cells * mN);
      try {
        for (int p = 0; p < cells; ++p) {
          final VecInt one = new VecInt();
          for (int i = 0; i < mN; ++i) {
            one.push(p * mN + i + 1);
          }
          sat.addExactly(one, 1);
          if (p % side + 1 < side) {
            clauses(sat, p, p + 1, 0);
            clauses(sat, p + 1, p, 1);
          }
          if (p + side < cells) {
            clauses(sat, p, p + side, 2);
            clauses(sat, p + side, p, 3);
          }
        }
        return sat.isSatisfiable();
      } catch (final ContradictionException e) {
        return false;
      } catch (final TimeoutException e) {
        throw new IllegalStateException("Board search incomplete at side " + side, e);
      }
    }

    private boolean tiles(final int x, final Axis h, final Axis v) {
      final int out = smallBoard(x, 300);
      if (out >= 0) {
        return out == 1;
      }
      if (x >= 9) {
        for (int w = 4; w <= 6; ++w) {
          if (periodic(h, v, w) || periodic(v, h, w)) {
            return true;
          }
        }
      }
      return satBoard(x);
    }

    private void pair(final Axis h, final Axis v, final long[] totals) {
      if (diagonal(h.mForward, v.mForward) || diagonal(h.mForward, v.mBackward) || square2(h, v, true)) {
        return;
      }
      if (!square2(h, v, false)) {
        ++totals[1];
        return;
      }
      if (periodic(h, v, 1) || periodic(v, h, 1) || periodic(h, v, 2) || periodic(v, h, 2)) {
        return;
      }
      setup(h, v);
      if (mN == 7) {
        if (smallBoard(6, 100) == 0 || periodic(h, v, 3) || periodic(v, h, 3)) {
          return;
        }
        for (final int s : new int[] {13, 17}) {
          if (tiles(s, h, v) && !tiles(s + 1, h, v)) {
            ++totals[s];
            System.out.println("Seven-type stop " + s + " relations=" + v.mCode + "/" + h.mCode);
          }
        }
      } else {
        if (periodic(h, v, 3) || periodic(v, h, 3)) {
          return;
        }
        for (int s = 2; s <= CEILING; ++s) {
          if (!tiles(s, h, v)) {
            ++totals[s - 1];
            return;
          }
        }
      }
    }
  }

  private static long[] sweep(final int n, final int workers) throws ExecutionException, InterruptedException {
    final Codes generated = new Codes();
    outgoing(new int[n], 0, 0, n == 7 ? 1 : 0, generated);
    final long[] codes = generated.sorted();
    final int[] ids = new int[codes.length];
    Arrays.fill(ids, -1);
    final Axis[] horizontal = new Axis[codes.length];
    final Axis[] vertical = new Axis[codes.length];
    int hc = 0;
    int vc = 0;
    for (int j = 0; j < codes.length; ++j) {
      final long code = codes[j];
      final long reflected = transpose(code, n);
      if (ids[j] < 0) {
        permute(code, new int[n], 0, 0, codes, ids, vc);
        vertical[vc++] = new Axis(code, reflected, ids[j], n);
      }
      if (code <= reflected) {
        horizontal[hc++] = new Axis(code, reflected, ids[j], n);
      }
    }
    final int countH = hc;
    final int countV = vc;
    System.out.println("types=" + n + " relations=" + codes.length + " orbits=" + vc);
    final ForkJoinPool pool = new ForkJoinPool(workers);
    final long[][] results = new long[vc][];
    try {
      pool.submit(() -> IntStream.range(0, countV).parallel().forEach(j -> {
        final Axis v = vertical[j];
        final Search s = new Search(n);
        final long[] r = new long[CEILING];
        for (int i = 0; i < countH; ++i) {
          final Axis h = horizontal[i];
          if (h.mOrbit >= v.mOrbit) {
            ++r[0];
            s.pair(h, v, r);
          }
        }
        results[j] = r;
      })).get();
    } finally {
      pool.shutdown();
    }
    final long[] all = new long[CEILING];
    for (final long[] r : results) {
      for (int j = 0; j < all.length; ++j) {
        all[j] += r[j];
      }
    }
    System.out.println("types=" + n + " pairs=" + all[0] + " exact-stops=" + Arrays.toString(Arrays.copyOfRange(all, 1, all.length)));
    return all;
  }

  /**
   * Check the finite census, without supplying sequence values.
   * @param args worker count and optional highest number of tiles (1 to 7)
   * @throws ExecutionException if a search failed
   * @throws InterruptedException if the search was interrupted
   */
  public static void main(final String[] args) throws ExecutionException, InterruptedException {
    final int workers = Integer.parseInt(args[0]);
    final int max = args.length == 1 ? 7 : Integer.parseInt(args[1]);
    if (workers < 1 || max < 1 || max > 7 || args.length > 2) {
      throw new IllegalArgumentException("Expected worker count and optional maximum 1..7");
    }
    for (int n = 1; n <= max; ++n) {
      final long[] result = sweep(n, workers);
      if (n <= 6 && max == 7) {
        // An incomplete seven-type relation restricts some tile to a
        // boundary. Its removal leaves a square on <=6 types. The
        // exact smaller censuses must rule out stops between side 12
        // and 17 before we restrict the seven-type relation roster.
        for (int s = 12; s < CEILING; ++s) {
          if (result[s] != 0) {
            throw new IllegalStateException("Seven-type boundary reduction did not apply");
          }
        }
      }
    }
  }
}
