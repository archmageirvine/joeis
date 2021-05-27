package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A047933 Consider primes p with least positive primitive root g such that q=p+g is next prime after p; sequence gives values of q.
 * @author Sean A. Irvine
 */
public class A047933 extends A001918 {

  @Override
  public Z next() {
    while (true) {
      final Z r = super.next();
      final Z q = getP().add(r);
      if (q.equals(mPrime.nextPrime(getP()))) {
        return q;
      }
    }
  }
}
