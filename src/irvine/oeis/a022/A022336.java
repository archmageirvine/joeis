package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003593;

/**
 * A022336 Exponent of 3 (value of i) in n-th number of form 3^i*5^j.
 * @author Sean A. Irvine
 */
public class A022336 extends A003593 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.THREE);
  }
}
