package irvine.oeis.a053;
// manually 2021-12-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053668 Product of digits of n^3.
 * @author Georg Fischer
 */
public class A053668 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.DIGIT_PRODUCT.z(Z.valueOf(mN).multiply(mN).multiply(mN));
  }
}
