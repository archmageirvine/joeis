package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A074850 Partial products of successive digits in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A074850 extends A000796 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (!mProd.isZero()) {
      mProd = mProd.multiply(super.next());
    }
    return mProd;
  }
}
