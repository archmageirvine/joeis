package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A060849 Difference between 2 consecutive primes between which a nontrivial power of prime is found.
 * @author Sean A. Irvine
 */
public class A060849 extends A025475 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(mPrime.prevPrime(p));
  }
}
