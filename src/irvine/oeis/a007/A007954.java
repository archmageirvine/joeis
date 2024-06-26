package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007954 Product of decimal digits of n.
 * @author Sean A. Irvine
 */
public class A007954 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.DIGIT_PRODUCT.z(mN);
  }
}
