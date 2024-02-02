package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068162 Smallest prime beginning and ending in at least n 7's.
 * @author Sean A. Irvine
 */
public class A068162 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.SEVEN;
    }
    final String s = "7".repeat(mN);
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
