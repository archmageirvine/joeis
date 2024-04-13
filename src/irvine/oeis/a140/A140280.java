package irvine.oeis.a140;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A140280 Product of digits of values in Pascal's triangle, by rows.
 * @author Georg Fischer
 */
public class A140280 extends A007318 {

  @Override
  public Z next() {
    return Functions.DIGIT_PRODUCT.z(10, super.next());
  }
}
