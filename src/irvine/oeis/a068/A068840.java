package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068840 Smallest prime with leading digits the same as those of n^n.
 * @author Sean A. Irvine
 */
public class A068840 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN).pow(mN);
    if (a.isProbablePrime()) {
      return a;
    }
    long lim = 1;
    long k = -1;
    while (true) {
      k += 2;
      if (k >= lim) {
        a = a.multiply(10);
        k = 1;
        lim *= 10;
      }
      final Z u = a.add(k);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
