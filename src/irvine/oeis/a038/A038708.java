package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A038708 Primes of the form (k-th primorial) + (k+1)-st prime.
 * @author Sean A. Irvine
 */
public class A038708 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next().add(mPrime.nextPrime(mP));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
