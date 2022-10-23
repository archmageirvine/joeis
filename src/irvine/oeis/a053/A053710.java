package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A053710 Prime-balanced factorials: factorials k! that are the mean of their 2 closest neighboring primes.
 * @author Sean A. Irvine
 */
public class A053710 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next(); // skip 0!
    super.next(); // skip 1!
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      final Z p = mPrime.prevPrime(f);
      final Z n = mPrime.nextPrime(f);
      if (p.add(n).divide2().equals(f)) {
        return f;
      }
    }
  }
}
