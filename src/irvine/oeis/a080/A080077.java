package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080077 Smallest prime p such that between p and the next prime for every k = 1, ..., n there is a number m_k whose smallest prime factor is prime(k).
 * @author Sean A. Irvine
 */
public class A080077 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private long mM = 1; // tracks the n-th prime

  private boolean is(final long p, final long q, final long r) {
    for (long s = (p / r) * r + r; s < q; s += r) {
      if (Functions.LPF.l(s) == r) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long p) {
    final long q = mPrime.nextPrime(p);
    for (long r = mM; r > 1; r = mPrime.prevPrime(r)) {
      if (!is(p, q, r)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mM = mPrime.nextPrime(mM);
    while (true) {
      if (is(mP)) {
        return Z.valueOf(mP);
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}

