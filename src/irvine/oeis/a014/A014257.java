package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014257 Product of digits of 2^n.
 * @author Sean A. Irvine
 */
public class A014257 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return Functions.DIGIT_PRODUCT.z(mA);
  }
}
