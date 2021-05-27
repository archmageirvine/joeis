package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A047934 Consider primes p with least positive primitive root g such that q=p+g is next prime after p; sequence gives values of p.
 * @author Sean A. Irvine
 */
public class A047934 extends A001918 {

  @Override
  public Z next() {
    while (true) {
      final Z r = super.next();
      if (getP().add(r).equals(mPrime.nextPrime(getP()))) {
        return getP();
      }
    }
  }
}
