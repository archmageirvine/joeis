package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A036453 a(n) = d(d(d(d(d(n))))), the 5th iterate of the number-of-divisors function d = A000005, with initial value n.
 * @author Sean A. Irvine
 */
public class A036453 extends A036452 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0();
  }
}

