package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A084632 Semiprimes such that when they are concatenated with their 10's complement, which also must be a semiprime, the result is a prime.
 * @author Sean A. Irvine
 */
public class A084632 extends A001358 {

  @Override
  public Z next() {
    while (true) {
      final Z semi = super.next();
      final Z tc = Functions.TENS_COMPLEMENT.z(semi);
      if (Predicates.SEMIPRIME.is(tc) && new Z(semi + tc.toString()).isProbablePrime()) {
        return semi;
      }
    }
  }
}

