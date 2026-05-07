package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a083.A083663;

/**
 * A084730 Smallest prime of the form k*n! - 1.
 * @author Sean A. Irvine
 */
public class A084730 extends A083663 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(super.next()).subtract(1);
  }
}
