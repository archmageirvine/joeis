package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065759 For a number k of length L, let f(k) be the sum of the products of the first i digits of k multiplied by the last L-i digits, for i from 1 to L-1, e.g., f(1234) = 1*234 + 12*34 + 123*4 = 1134. Sequence gives k such that f(k) = k.
 * @author Sean A. Irvine
 */
public class A065759 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      long v = 0;
      long w = 1;
      long s = 0;
      while (u != 0 && s <= mN) {
        v += w * (u % 10);
        w *= 10;
        u /= 10;
        s += u * v;
      }
      if (mN == s) {
        return Z.valueOf(mN);
      }
    }
  }
}
