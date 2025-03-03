package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075659 Sum of prime divisors (A008472) is a power of an integer with exponent greater than 1.
 * @author Sean A. Irvine
 */
public class A075659 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.POWER.is(Functions.SOPF.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
