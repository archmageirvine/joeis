package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068842 Smallest prime larger than 2^n whose digits begin with those of 2^n.
 * @author Sean A. Irvine
 */
public class A068842 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z a = Z.TWO.pow(++mN);
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
