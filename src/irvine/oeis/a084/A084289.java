package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A084289 Primes p such that the arithmetic mean of p and the next prime after p is a true prime power from A025475.
 * @author Sean A. Irvine
 */
public class A084289 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (Predicates.PRIME_POWER.is(p.add(q).divide2())) {
        return p;
      }
    }
  }
}
