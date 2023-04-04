package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a003.A003016;

/**
 * A062527 Smallest number (&gt;1) which appears at least n times in Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A062527 extends A003016 {

  {
    super.next();
    super.next();
    setOffset(1);
  }
  private long mBest = 0;
  private int mBestCount = 0;
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mBestCount < mN) {
      ++mM;
      final int t = super.next().intValueExact();
      if (t > mBestCount) {
        mBest = mM;
        mBestCount = t;
      }
    }
    return Z.valueOf(mBest);
  }
}
