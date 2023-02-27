package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a066.A066459;

/**
 * A061603 a(n) = n! / {product of factorials of the digits of n}.
 * @author Sean A. Irvine
 */
public class A061603 extends A066459 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.divide(super.next());
  }
}

