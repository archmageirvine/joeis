package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020480 Primes p which divide no <code>f(q)-1</code> or <code>f(q)+1</code> for prime q <code>&lt;</code> p, where <code>f(q)</code> is the product of all primes <code>&lt;=</code> q.
 * @author Sean A. Irvine
 */
public class A020480 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      boolean ok = true;
      for (long f = 1, p = 2; p < mN; p = mPrime.nextPrime(p)) {
        f *= p;
        f %= mN;
        if (f == 1 || f == mN - 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
