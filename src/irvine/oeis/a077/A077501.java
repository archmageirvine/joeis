package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077501 a(n) = smallest prime greater than a(n-1) and beginning with n.
 * @author Sean A. Irvine
 */
public class A077501 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  protected Z solve(final Z n) {
    Z t = n.multiply(10);
    long lim = 10;
    while (t.compareTo(mA) < 0) {
      t = t.multiply(10);
      lim *= 10;
    }
    long v = -1;
    while (true) {
      v += 2;
      if (v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 1; // to allow for leading 0s in what is appended
      }
      if (v % 5 != 0) {
        final Z u = t.add(v);
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }

  @Override
  public Z next() {
    mA = solve(Z.valueOf(++mN));
    return mA;
  }
}

