package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A025046 a(n) = the least odd prime p such that there are exactly n consecutive quadratic remainders modulo p.
 * @author Sean A. Irvine
 */
public class A025046 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  private long least(final int p, final int n) {
    final boolean[] seen = new boolean[p];
    for (long k = 0; k < p; ++k) {
      seen[(int) ((k * k) % p)] = true;
    }
    for (int k = 0; k < p; ++k) {
      if (!seen[k]) {
        boolean ok = true;
        int i = k;
        for (int j = 0; j < n; ++j) {
          if (++i >= p) {
            i = 0;
          }
          if (!seen[i]) {
            ok = false;
            break;
          }
        }
        if (ok) {
          if (++i >= p) {
            i = 0;
          }
          if (!seen[i]) {
            return (k + 1) % p;
          }
        }
      }
    }
    return -1;
  }

  protected Z select(final long p, final long least) {
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final long least = least((int) p, mN);
      if (least >= 0) {
        return select(p, least);
      }
    }
  }
}

