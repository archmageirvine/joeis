package irvine.oeis.a107;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A107650 Numbers n such that both numbers <code>n/(d_1*d_2* ...*d_k)</code> and <code>n/(d_1+d_2+</code> ... <code>+d_k)</code> are prime, where <code>d_1 d_2</code> ... <code>d_k</code> is the decimal expansion of n.
 * @author Sean A. Irvine
 */
public class A107650 implements Sequence {

  private long mN = 11132;
  private final Fast mPrime = new Fast();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      long s = 0;
      long p = 1;
      long n = ++mN;
      while (n != 0) {
        final long q = n % 10;
        n /= 10;
        p *= q;
        if (p == 0) {
          break;
        }
        s += q;
      }
      if (p != 0 && mN % p == 0 && mN % s == 0 && mPrime.isPrime(mN / p) && mPrime.isPrime(mN / s)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000000 == 0) {
        System.out.println("[" + mN + "]");
      }
    }
  }
}

