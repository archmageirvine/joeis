package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068161 Smallest prime beginning and ending in at least n 3's.
 * @author Sean A. Irvine
 */
public class A068161 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    final String s = "3".repeat(mN);
    long lim = 20;
    long k = 9;
    while (true) {
      if (++k == lim) {
        lim *= 10;
        k = lim / 2;
      }
      final Z t = new Z(s + String.valueOf(k).substring(1) + s);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
