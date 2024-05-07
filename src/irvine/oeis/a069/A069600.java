package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A069600 Smallest square containing all the digits of numbers from 1 to n. For a(10) and higher, all duplicated digits must be in the term (for example a(10) has two 1's).
 * @author Sean A. Irvine
 */
public class A069600 extends Sequence1 {

  private int mN = 0;
  private final Sequence mSquares;
  private final int[] mCounts = new int[10];
  private Z mSq;
  private int[] mSqCnt;

  protected A069600(final Sequence seq) {
    mSquares = seq;
    mSq = mSquares.next();
    mSqCnt = ZUtils.digitCounts(mSq);
  }

  /** Construct the sequence. */
  public A069600() {
    this(new A000290());
  }

  private boolean le(final int[] a, final int[] b) {
    for (int k = 0; k < a .length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (int k = 0; k < mCounts.length; ++k) {
      mCounts[k] += cnts[k];
    }
    while (!le(mCounts, mSqCnt)) {
      mSq = mSquares.next();
      mSqCnt = ZUtils.digitCounts(mSq);
    }
    return mSq;
  }
}
