package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A052011 Number of primes between successive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A052011 extends A000045 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next();
  }
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
