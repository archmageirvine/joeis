package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A072037 Palindromic powers (with positive exponents) of a prime but not a prime (A025475).
 * @author Sean A. Irvine
 */
public class A072037 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (!palin.isProbablePrime() && Predicates.PRIME_POWER.is(palin)) {
        return palin;
      }
    }
  }
}
