package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A022329 Exponent of 3 (value of j) in n-th number of form 2^i*3^j (see A003586).
 * @author Sean A. Irvine
 */
public class A022329 extends A003586 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next().makeOdd(), Z.THREE);
  }
}
