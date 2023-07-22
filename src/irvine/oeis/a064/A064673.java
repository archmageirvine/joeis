package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064673 Where the least prime p such that n = (p-1)/(q-1) and p &gt; q is not the least prime == 1 (mod n) (A034694).
 * @author Sean A. Irvine
 */
public class A064673 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long p = 2;
      long q;
      while ((p - 1) % mN != 0 || !mPrime.isPrime(q = (p - 1) / mN + 1) || q >= p) {
        p = mPrime.nextPrime(p);
      }
      long k = 1;
      while (!mPrime.isPrime(k * mN + 1)) {
        ++k;
      }
      if (p != k * mN + 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
