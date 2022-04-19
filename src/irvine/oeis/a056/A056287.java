package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A056287 Maximal AND-OR formula complexity (operator count) for n-input Boolean functions.
 * @author Sean A. Irvine
 */
public class A056287 implements Sequence {

  // After Russ Cox
  // see https://oeis.org/A056287/a056287.txt

  private static final int MAXN = 5;
  private static final long MAXM = 1L << (1 << MAXN);
  private static final long MAXQUEUE = MAXM + 1;

  private final LongDynamicIntArray mCost = new LongDynamicIntArray(); // no. of literals used = 1+no. of operations
  private final LongDynamicLongArray mParents = new LongDynamicLongArray(); // packed 32-bit parent numbers

  private static long pack(final long a, final long b) {
    return (a << Integer.SIZE) | b;
  }

  private final LongDynamicLongArray mQueue = new LongDynamicLongArray(); // queue of functions to examine
  private long mReadPointer, mWritePointer;
  private final LongDynamicBooleanArray mInQueue = new LongDynamicBooleanArray(); // is f in the queue

  private int mN = 0;
  private long mM = 0;    /* 1<<(1<<n) */

  private void addQueue(final long f) {
    if (mInQueue.isSet(f)) {
      return;
    }
    mInQueue.set(f);
    mQueue.set(mWritePointer, f);
    if (++mWritePointer == MAXQUEUE) {
      mWritePointer = 0;
    }
    assert mWritePointer != mReadPointer;
  }

  private boolean isEmptyQueue() {
    return mWritePointer == mReadPointer;
  }

  private long fromQueue() {
    assert mWritePointer != mReadPointer;
    final long f = mQueue.get(mReadPointer);
    if (++mReadPointer == MAXQUEUE) {
      mReadPointer = 0;
    }
    mInQueue.clear(f);
    return f;
  }

  /* boolean for literal a, b, c, d, etc. */
  private long literal(final int i) {
    long f = 0;
    for (long j = 0; j < (1L << mN); ++j) {
      f |= (j & (1L << i)) != 0 ? (1L << j) : 0;
    }
    return f;
  }

  /* negate */
  private long neg(final long f) {
    return (mM - 1) ^ f;
  }

  /* note that we can build f out of a and b */
  private void build(final long f, final long a, final long b) {
    if (mCost.get(f) != 0 && mCost.get(f) < mCost.get(a) + mCost.get(b)) {
      return;
    }

    mCost.set(f, mCost.get(a) + mCost.get(b));
    mParents.set(f, pack(a, b));

    addQueue(f);
  }

  @Override
  public Z next() {
    if (++mN > MAXN) {
      throw new UnsupportedOperationException();
    }
    mM = 1L << (1 << mN);
    mReadPointer = 0;
    mWritePointer = 0;
    mCost.truncate(0);
    mParents.truncate(0);

    for (int i = 0; i < mN; ++i) {
      final long f = literal(i);
      mCost.set(f, 1);
      mParents.set(f, pack(0, i + 1));
      addQueue(f);
      mCost.set(neg(f), 1);
      mParents.set(neg(f), pack(i + 1, 0));
      addQueue(neg(f));
    }

    while (!isEmptyQueue()) {
      final long i = fromQueue();
      for (long j = 0; j < mM; ++j) {
        if (mCost.get(j) == 0) { // not built yet
          continue;
        }
        build(i & j, i, j);
        build(i | j, i, j);
      }
    }

    long worstf = 0;
    for (long i = 0; i < mM; ++i) {
      if (mCost.get(i) > mCost.get(worstf)) {
        worstf = i;
      }
    }

    return Z.valueOf(mCost.get(worstf) - 1);
  }
}
