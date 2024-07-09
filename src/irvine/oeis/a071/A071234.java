package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071234 Smallest prime beginning and ending in 2n+1 or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A071234 extends Sequence0 {

  private long mN = -1;
  private long mM = 10;

  @Override
  public Z next() {
    mN += 2;
    if (mN >= mM) {
      mM *= 10;
    }
    if (mN > 5 && mN % 5 == 0) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    // Deal with primes and self-overlaps
    final String s = String.valueOf(mN);
    long m = 1;
    for (int k = s.length(); k >= 0; --k, m *= 10) {
      if (s.endsWith(s.substring(0, k))) {
        final Z v = n.multiply(m).add(mN % m);
        if (v.isProbablePrime()) {
          return v;
        }
      }
    }
    long k = -1;
    long lim = 10;
    Z v = Z.valueOf(mN * 10);
    while (true) {
      if (++k == lim) {
        k = 0;
        lim *= 10;
        v = v.multiply(10);
      }
      final Z t = v.add(k).multiply(mM).add(mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
