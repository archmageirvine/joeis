package irvine.oeis.a365;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A365160 Least k such that A000668(n) + k is prime, where A000668(n) is the n-th Mersenne prime.
 * @author Sean A. Irvine
 */
public class A365160 extends A000668 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
