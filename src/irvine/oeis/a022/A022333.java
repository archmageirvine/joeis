package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A022333 Exponent of 5 (value of j) in n-th number of form 2^i*5^j.
 * @author Sean A. Irvine
 */
public class A022333 extends A003592 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next().makeOdd(), Z.FIVE);
  }
}
