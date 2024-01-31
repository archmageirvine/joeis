package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068160 Smallest prime beginning and ending in exactly n 1's and containing at least one digit != 1.
 * @author Sean A. Irvine
 */
public class A068160 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String s = "1".repeat(++mN);
    long skip = 11;
    long lim = 20;
    long k = 9;
    long forbidden = 11;
    while (true) {
      if (++k == lim) {
        lim *= 10;
        skip *= 10;
        k = lim / 2;
        forbidden = forbidden * 10 + 1;
      } else if (k == skip) {
        k += lim / 20;
      }
      if (k % 10 != 1) {
        final Z t = new Z(s + String.valueOf(k).substring(1) + s);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
  }
}
