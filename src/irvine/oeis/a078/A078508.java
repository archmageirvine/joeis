package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078508 Number of primes between sqrt(n^3) and sqrt((n+1)^3).
 * @author Sean A. Irvine
 */
public class A078508 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z p = mPrime.nextPrime(Z.valueOf(mN).pow(3).sqrt());
    final Z end = Z.valueOf(mN + 1).pow(3).sqrt();
    long cnt = 0;
    while (p.compareTo(end) < 0) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}

