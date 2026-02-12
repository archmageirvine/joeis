package irvine.oeis.a392;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A392806 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A392806 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;
  private long mP = 2;
  private long mM = 1;

  private Z sum(long n, final long p) {
    Z s = Z.ZERO;
    while (n > 0) {
      s = s.add(n);
      n /= p;
    }
    return s;
  }

  private Z pp(final long p, final long e) {
    return e == 0 ? Z.ZERO : pp(p, e - 1).multiply(p).add(Z.valueOf(p).pow(e).multiply2()).subtract(1);
  }

  /**
   * Return an element of this sequence.
   * @param n index
   * @param p prime
   * @return value
   */
  public Z t(long n, final long p) {
    final ArrayList<Long> d = new ArrayList<>();
    while (n > 0) {
      d.add(n % p);
      n /= p;
    }
    final int len = d.size() - 1;
    Z a = Z.ZERO;
    int k = 0;
    long ns = 0;
    while (k < len) {
      ns = ns * p + d.get(len - k);
      ++k;
      if (d.get(len - k) > 0) {
        final Z t = sum(ns, p).multiply(Z.valueOf(p).pow(len - k)).multiply2().subtract(pp(p, len - k));
        a = a.add(t.max(Z.ZERO).multiply(d.get(len - k)));
      }
    }
    return a;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (++mM > Functions.PRIME_PI.l(mN - 1)) {
      ++mN;
      mP = 2;
      mM = 1;
    }
    return t(mN, mP);
  }
}
