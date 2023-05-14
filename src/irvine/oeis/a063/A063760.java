package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a048.A048146;

/**
 * A063760 Numbers whose sum of non-unitary divisors is a prime and sets a new record for such primes.
 * @author Sean A. Irvine
 */
public class A063760 extends A048146 {

  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mRecord) > 0 && t.isProbablePrime()) {
        mRecord = t;
        return Z.valueOf(mN);
      }
    }
  }
}
