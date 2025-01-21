package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a038.A038833;

/**
 * A074382 Difference between (1+3^n)-th and (3^n)-th primes.
 * @author Sean A. Irvine
 */
public class A074382 extends Sequence0 {

  private final Sequence mA = new A038833();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z p = mA.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
