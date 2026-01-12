package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392199 Positive integers k such that gcd(k, sigma(k)) is prime.
 * @author Sean A. Irvine
 */
public class A392199 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PRIME.is(Functions.GCD.l(++mN, Functions.SIGMA1.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

