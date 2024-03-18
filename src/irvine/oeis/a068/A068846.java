package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068846 Smallest prime with same leading digits as 6^n.
 * @author Sean A. Irvine
 */
public class A068846 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z a = Z.SIX.pow(++mN);
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
