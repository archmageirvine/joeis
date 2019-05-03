package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007697 Smallest odd number expressible in at least n ways as <code>p+2*m^2</code> where p is 1 or a prime and m <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A007697 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 1;

  private long countWays(final long m) {
    long cnt = 0;
    long t;
    for (long s = 0; (t = m - 2 * s * s) > 0; ++s) {
      if (t == 1 || mPrime.isPrime(t)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (countWays(mM) >= mN) {
        return Z.valueOf(mM);
      }
      mM += 2;
    }
  }

}
