package irvine.math.turing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Event-driven n-gram closed position set on an ordinary or history-augmented tape.
 * @author Gregory Morse
 */
final class GramClosure {
  private static final Word EMPTY = new Word(0, 0, null, null);
  private final int[] mTable;
  private final int[] mHistoryTokens;
  private final int mAlphabet;
  private final int mBits;
  private final int mMask;
  private final int mLeftWidth;
  private final int mRightWidth;
  private final long mModulus;
  private final int mLimit;
  private final boolean mLru;
  private final Map<Long, Integer> mSymbolIds = new HashMap<>();
  private final List<Long> mSymbols = new ArrayList<>();
  private final Map<Long, Word> mWords = new HashMap<>();
  private final Side mLeft = new Side();
  private final Side mRight = new Side();
  private final Set<Context> mSeen = new HashSet<>();
  private final ArrayDeque<Context> mQueue = new ArrayDeque<>();
  private int mWork;
  private boolean mCapped;

  GramClosure(final int[] table, final int leftWidth, final int rightWidth, final int length, final boolean lru, final int limit) {
    this(table, 2, leftWidth, rightWidth, length, lru, limit);
  }

  GramClosure(final int[] table, final int alphabet, final int leftWidth, final int rightWidth,
              final int length, final boolean lru, final int limit) {
    if (alphabet < 2 || alphabet > 8 || table.length > 64
      || leftWidth < 1 || leftWidth > 24 || rightWidth < 1 || rightWidth > 24 || length < 0 || length > 10
      || limit < 1 || limit > 200_000) {
      throw new IllegalArgumentException("Unsafe history-closure parameters");
    }
    this.mTable = table;
    this.mAlphabet = alphabet;
    mBits = 32 - Integer.numberOfLeadingZeros(alphabet - 1);
    mMask = (1 << mBits) - 1;
    this.mLeftWidth = leftWidth;
    this.mRightWidth = rightWidth;
    this.mLru = lru;
    this.mLimit = limit;
    mHistoryTokens = new int[table.length];
    int token = 0;
    for (int slot = 0; slot < table.length; ++slot) {
      if (table[slot] >= 0) {
        // A history only records defined transitions. Dense names keep
        // the base-11 representation injective for sparse tables too.
        mHistoryTokens[slot] = ++token;
      }
    }
    if (token > 10) {
      throw new IllegalArgumentException("Too many defined transitions for base-11 histories");
    }
    long mod = 1;
    for (int i = 0; i < length; ++i) {
      mod *= 11;
    }
    mModulus = mod;
  }

  private static final class Word {
    private final int mId;
    private final int mFirst;
    private final Word mTail;
    private final Word mPrefix;

    private Word(final int id, final int first, final Word tail, final Word prefix) {
      this.mId = id;
      this.mFirst = first;
      this.mTail = tail;
      this.mPrefix = prefix;
    }
  }

  private static final class Context {
    private final Word mLeft;
    private final Word mRight;
    private final int mState;
    private final int mCenter;

    private Context(final Word left, final Word right, final int state, final int center) {
      this.mLeft = left;
      this.mRight = right;
      this.mState = state;
      this.mCenter = center;
    }

    @Override
    public int hashCode() {
      return ((mLeft.mId * 31 + mRight.mId) * 31 + mCenter) * 31 + mState;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Context)) {
        return false;
      }
      final Context c = (Context) obj;
      return mLeft == c.mLeft && mRight == c.mRight && mState == c.mState && mCenter == c.mCenter;
    }
  }

  private static final class Pending {
    private final Word mPushed;
    private final int mState;
    private final int mCenter;
    private final boolean mMoveRight;

    private Pending(final Word pushed, final int state, final int center, final boolean moveRight) {
      this.mPushed = pushed;
      this.mState = state;
      this.mCenter = center;
      this.mMoveRight = moveRight;
    }
  }

  private final class Side {
    private final Map<Integer, Bucket> mIndex = new HashMap<>();
    private final Set<Word> mGrams = new HashSet<>();

    private Bucket bucket(final Word prefix) {
      return mIndex.computeIfAbsent(prefix.mId, id -> new Bucket());
    }

    private void record(final Word word) {
      if (mGrams.add(word)) {
        final Bucket bucket = bucket(word.mPrefix);
        bucket.mGrams.add(word);
        for (final Pending request : bucket.mWaiting) {
          deliver(request, word);
          if (mCapped) {
            return;
          }
        }
      }
    }

    private void request(final Word prefix, final Pending request) {
      final Bucket bucket = bucket(prefix);
      bucket.mWaiting.add(request);
      for (final Word word : bucket.mGrams) {
        deliver(request, word);
        if (mCapped) {
          return;
        }
      }
    }
  }

  private static final class Bucket {
    private final List<Word> mGrams = new ArrayList<>();
    private final List<Pending> mWaiting = new ArrayList<>();
  }

  private int symbol(final long key) {
    final int id = mSymbols.size();
    final Integer old = mSymbolIds.putIfAbsent(key, id);
    if (old == null) {
      mSymbols.add(key);
      return id;
    }
    return old;
  }

  private Word cons(final int first, final Word tail) {
    final long key = (long) first << 32 | tail.mId;
    Word word = mWords.get(key);
    if (word == null) {
      final Word prefix = tail == EMPTY ? EMPTY : cons(first, tail.mPrefix);
      word = new Word(mWords.size() + 1, first, tail, prefix);
      mWords.put(key, word);
    }
    return word;
  }

  private Word blank(final int size) {
    Word result = EMPTY;
    for (int i = 0; i < size; ++i) {
      result = cons(0, result);
    }
    return result;
  }

  private long history(final long old, final int token) {
    if (!mLru) {
      return (11 * old + token) % mModulus;
    }
    long result = token;
    long place = 11;
    for (long tail = old; tail != 0; tail /= 11) {
      final long item = tail % 11;
      if (item != token) {
        result += place * item;
        place *= 11;
      }
    }
    return result;
  }

  private void add(final Context c) {
    if (mSeen.add(c)) {
      mQueue.addLast(c);
      mCapped |= mSeen.size() > mLimit;
    }
  }

  private void deliver(final Pending request, final Word popped) {
    if (++mWork > 12 * mLimit) {
      mCapped = true;
    } else if (request.mMoveRight) {
      add(new Context(request.mPushed, popped, request.mState, request.mCenter));
    } else {
      add(new Context(popped, request.mPushed, request.mState, request.mCenter));
    }
  }

  boolean closes() {
    symbol(0);
    final Word leftBlank = blank(mLeftWidth);
    final Word rightBlank = blank(mRightWidth);
    mLeft.record(leftBlank);
    mRight.record(rightBlank);
    add(new Context(leftBlank, rightBlank, 0, 0));
    while (!mQueue.isEmpty() && !mCapped) {
      final Context c = mQueue.removeFirst();
      final long read = mSymbols.get(c.mCenter);
      final int slot = mAlphabet * c.mState + (int) (read & mMask);
      final int rule = mTable[slot];
      if (rule < 0) {
        return false;
      }
      final int write = symbol((history(read >>> mBits, mHistoryTokens[slot]) << mBits) | (rule >>> 1 & mMask));
      final boolean toRight = (rule & 1) != 0;
      final Word from = toRight ? c.mRight : c.mLeft;
      final Word dest = toRight ? c.mLeft : c.mRight;
      (toRight ? mLeft : mRight).record(dest);
      if (!mCapped) {
        (toRight ? mRight : mLeft).request(from.mTail,
          new Pending(cons(write, dest.mPrefix), rule >>> (mBits + 1), from.mFirst, toRight));
      }
    }
    return !mCapped;
  }
}
