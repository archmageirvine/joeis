package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a020.A020639;

/**
 * A053590 Product of the longest chain of consecutive primes (starting with A020639(n)) which divides n.
 * @author Sean A. Irvine
 */
public class A053590 extends A020639 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long p = super.next().longValueExact();
    long prod = p;
    while (mN % (p = mPrime.nextPrime(p)) == 0) {
      prod *= p;
    }
    return Z.valueOf(prod);
  }
}
