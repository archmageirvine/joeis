package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A066385 Smallest maximum of sum of 3 consecutive terms in any arrangement of [1..n] in a circle.
 * @author Timothy Rolfe
 * @author Sean A. Irvine
 */
public class A066385 extends Sequence3 {

  private static final class IntQueue {
    private final int[] mPool;
    private int mFront;
    private int mBack;
    private int mEntries;

    private IntQueue(final int size) {
      mPool = new int[size];
      mFront = -1;
      mBack = -1;
      mEntries = 0;
    }

    private int nextItem() {
      return mPool.length > 0 ? mPool[mFront] : Integer.MIN_VALUE;
    }

    private boolean isEmpty() {
      return mEntries == 0;
    }

    private boolean isFull() {
      return mEntries == mPool.length;
    }

    private void enqueue(final int item) {
      if (isFull()) {
        throw new RuntimeException();
      }
      if (++mBack == mPool.length) {
        mBack = 0;
      }
      if (mFront < 0) {
        mFront = mBack;
      }
      ++mEntries;
      mPool[mBack] = item;
    }

    private int dequeue() {
      final int item = mPool[mFront];
      if (isEmpty()) {
        throw new RuntimeException();
      }
      if (++mFront == mPool.length) {
        mFront = 0;
      }
      --mEntries;
      return item;
    }
  }

  private int mN = 2;
  private int mMaxTot;      // Largest allowed triple total
  private int[] mFace;        // Array holding the permutation

  private void initialize(final int size, final int lim, final int item) {
    mMaxTot = lim;
    mFace = new int[size];
    mFace[0] = item;
  }

  private boolean isSolvable(final IntQueue work, final int posn) {
    if (work.isEmpty()) {
      return mFace[posn - 1] < mFace[1];
    } else {
      final int marker = work.nextItem();
      do {
        mFace[posn] = work.dequeue();
        if (check(posn) && isSolvable(work, posn + 1)) {
          return true;
        }
        work.enqueue(mFace[posn]);
      } while (marker != work.nextItem());
    }
    return false;
  }

  // Check whether the current clock face meets the restriction on
  // the maximum allowed triplet sum.  Note that this presumes that
  // the face is valid UP TO making an entry into this position.
  private boolean check(final int posn) {
    int total = 0;
    int idx = Math.max(posn - 2, 0);
    while (idx <= posn) {
      total += mFace[idx++];
    }
    if (total > mMaxTot) {
      return false;
    }
    // At the end, test the wrap-around cases:
    if (posn == mFace.length - 1) {
      total = mFace[posn - 1] + mFace[posn] + mFace[0];
      if (total > mMaxTot) {
        return false;
      }
      total = mFace[posn] + mFace[0] + mFace[1];
      return total <= mMaxTot;
    }
    return true;
  }

  @Override
  public Z next() {
    int best = (3 * ++mN + 1) / 2 + 3;
    if (mN > 6 && (mN & 1) == 0) {
      return Z.valueOf(best);
    }
    while (true) {
      mMaxTot = best - 1;
      final IntQueue work = new IntQueue(mN);
      for (int k = 1; k <= mN; k++) {
        work.enqueue(k);
      }
      initialize(mN, mMaxTot, work.dequeue());
      if (!isSolvable(work, 1)) {
        break;
      }
      --best;
      if (mN > 3) {
        break;
      }
    }
    return Z.valueOf(best);
  }
}
