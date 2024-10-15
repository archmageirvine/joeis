package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a005.A005277;

/**
 * A072607 If D[n] is divisor-set of n, then in set of 1+D only 2 primes occur:{2,3}; also n is not squarefree.
 * @author Sean A. Irvine
 */
public class A072607 extends A005277 {

  private boolean is(final Z n) {
    if (Predicates.SQUARE_FREE.is(n)) {
      return false;
    }
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.compareTo(Z.TWO) > 0 && d.add(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (is(t)) {
        return t;
      }
    }
  }
}
