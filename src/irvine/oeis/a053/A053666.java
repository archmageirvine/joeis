package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053666 Product of digits of n-th prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A053666 extends A000040 {

  @Override
  public Z next() {
    return Functions.DIGIT_PRODUCT.z(super.next());
  }
}
