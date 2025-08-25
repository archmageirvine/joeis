package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079648 Number of primes between n^2 and n^3.
 * @author Sean A. Irvine
 */
public class A079648 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    final Z end = mN.pow(3);
    for (Z p = mPrime.nextPrime(mN.square()); p.compareTo(end) < 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

