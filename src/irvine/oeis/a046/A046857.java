package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046857 a(n) = (2^n)!/(n!^2).
 * @author Sean A. Irvine
 */
public class A046857 extends Sequence1 {

  private int mN = 0;
  private Z mA = Z.ONE;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 1L << mN) {
      mA = mA.multiply(mM++);
    }
    mA = mA.divide(mN).divide(mN);
    return mA;
  }
}
