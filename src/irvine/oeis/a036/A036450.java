package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a010.A010553;

/**
 * A036450 a(n) = d(d(d(n))), the 3rd iterate of the number-of-divisors function with an initial value of n.
 * @author Sean A. Irvine
 */
public class A036450 extends A010553 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

