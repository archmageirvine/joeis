package irvine.oeis.a238;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a052.A052129;

/**
 * A238462 2-adic valuation of A052129.
 * @author Georg Fischer
 */
public class A238462 extends A052129 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.TWO);
  }
}
