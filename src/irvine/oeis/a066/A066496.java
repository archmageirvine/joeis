package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066496 a(n) = least solution k of f(k) = f(k-1) + ... + f(k-n), where f(m) = prime(m+1)-prime(m) and prime(m) denotes the m-th prime, if k exists; 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066496 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    long k = mN + 1;
    long q = mP;
    long s = 2;
    while (true) {
      final long r = mPrime.nextPrime(q);
      if (2 * q == r + s) {
        return Z.valueOf(k);
      }
      ++k;
      q = r;
      s = mPrime.nextPrime(s);
    }
  }
}
