package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a078.A078972;

/**
 * A084629 Brilliant numbers such that when they are concatenated with their 10's complement, which also must be brilliant, the result is a prime.
 * @author Sean A. Irvine
 */
public class A084629 extends A078972 {

  @Override
  public Z next() {
    while (true) {
      final Z brilliant = super.next();
      final Z tc = Functions.TENS_COMPLEMENT.z(brilliant);
      if (Predicates.BRILLIANT.is(tc) && new Z(brilliant + tc.toString()).isProbablePrime()) {
        return brilliant;
      }
    }
  }
}

