package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385827 allocated for Richard S. Chang.
 * @author Sean A. Irvine
 */
public class A385827 extends Sequence0 {

  private Z mFive = null;
  private Z mTwo = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mFive = mFive == null ? Z.ONE : mFive.multiply(5);
    Z lo;
    do {
      lo = mFive.subtract(mTwo);
      ++mN;
      mTwo = mTwo.multiply2();
    } while (mTwo.compareTo(mFive) < 0);
    final Z hi = mTwo.subtract(mFive);
    return Z.valueOf(lo.compareTo(hi) < 0 ? mN - 1 : mN);
  }
}
