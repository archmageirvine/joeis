package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062331 a(n) is the product of the sum and the product of the digits of n (0 is not to be considered a factor in the product).
 * @author Sean A. Irvine
 */
public class A062331 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.DIGIT_NZ_PRODUCT.z(10, mN).multiply(Functions.DIGIT_SUM.l(mN));
  }
}
