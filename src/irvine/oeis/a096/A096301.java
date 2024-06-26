package irvine.oeis.a096;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A096301 Product of nonzero digits(sum of digits(n^n)).
 * @author Georg Fischer
 */
public class A096301 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.DIGIT_NZ_PRODUCT.z(10, Z.valueOf(Functions.DIGIT_SUM.l(Z.valueOf(mN).pow(mN))));
  }
}
