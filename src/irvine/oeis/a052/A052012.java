package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000204;

/**
 * A052012 Number of primes between successive Lucas numbers.
 * @author Sean A. Irvine
 */
public class A052012 extends A000204 {

  private final Fast mPrime = new Fast();
  private Z mA = super.next();

  @Override
  public Z next() {
    final Z lo = mA;
    mA = super.next();
    long cnt = 0;
    for (Z p = mPrime.nextPrime(lo); p.compareTo(mA) < 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
