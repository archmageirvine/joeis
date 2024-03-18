package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068845 Final digits of the smallest prime starting with n!.
 * @author Sean A. Irvine
 */
public class A068845 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z a = mF;
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
        return Z.valueOf(k);
      }
    }
  }
}
