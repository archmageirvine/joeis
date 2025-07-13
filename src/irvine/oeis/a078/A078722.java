package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078722 a(n) = prime(n*(n+1)/2+2).
 * @author Sean A. Irvine
 */
public class A078722 extends Sequence0 {

  private final Fast mPrimes = new Fast();
  private long mP = 1;
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long t = mN * (mN + 1) / 2 + 2;
    while (mM < t) {
      ++mM;
      mP = mPrimes.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
