package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083388 a(n) = beginning of a run of at least n primes when x -&gt; 3*x + 2 is iterated.
 * @author Sean A. Irvine
 */
public class A083388 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;
  private long mLen = 0;

  private long length(final long p) {
    Z q = Z.valueOf(p);
    long cnt = 0;
    while (q.isProbablePrime()) {
      ++cnt;
      q = q.multiply(3).add(2);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mLen < mN) {
      mP = mPrime.nextPrime(mP);
      mLen = length(mP);
    }
    return Z.valueOf(mP);
  }
}
