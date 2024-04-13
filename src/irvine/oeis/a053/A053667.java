package irvine.oeis.a053;
// manually 2021-12-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053667 Product of digits of n^2.
 * @author Georg Fischer
 */
public class A053667 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.DIGIT_PRODUCT.z(Z.valueOf(mN).multiply(mN));
  }
}
