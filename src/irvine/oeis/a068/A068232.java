package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068232 a(n) is the smallest prime p such that p and the next n-1 primes are all == 1 (mod 12).
 * @author Sean A. Irvine
 */
public class A068232 extends A000040 {

  private Z mP = super.next();
  private long mN = 0;
  private long mLen = 0;

  protected long count(Z p) {
    long cnt = 0;
    while (p.mod(12) == 1) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mLen >= mN) {
        return mP;
      }
      mP = super.next();
      mLen = count(mP);
    }
  }
}
