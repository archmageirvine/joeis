package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025046 a(n) = the least odd prime p such that there are exactly n consecutive quadratic remainders modulo p.
 * @author Sean A. Irvine
 */
public class A025046 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  private boolean is(final int p, final int n) {
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
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is((int) p, mN)) {
        return Z.valueOf(p);
      }
    }
  }
}

