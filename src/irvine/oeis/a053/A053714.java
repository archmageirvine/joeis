package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A053714 Smallest (in magnitude) nonzero number m such that n!+m is prime.
 * @author Sean A. Irvine
 */
public class A053714 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    final Z f = super.next();
    final Z a = f.subtract(mPrime.prevPrime(f));
    final Z b = mPrime.nextPrime(f).subtract(f);
    return a.compareTo(b) < 0 ? a.negate() : b;
  }
}
