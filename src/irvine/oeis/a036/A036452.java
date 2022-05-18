package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A036452 a(n) = d(d(d(d(n)))), the 4th iterate of number-of-divisors function with initial value of n.
 * @author Sean A. Irvine
 */
public class A036452 extends A036450 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}

