package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A394735 Primes prime(k) such that prime(k+1) - prime(k) is a perfect power.
 * @author Sean A. Irvine
 */
public class A394735 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p) || Predicates.POWER.is(mPrime.nextPrime(p).subtract(p))) {
        return p;
      }
    }
  }
}

