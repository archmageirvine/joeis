package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036301 Numbers whose sum of even digits and sum of odd digits are equal.
 * @author Sean A. Irvine
 */
public class A036301 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      long e = 0;
      long o = 0;
      while (m != 0) {
        if ((m & 1) == 0) {
          e += m % 10;
        } else {
          o += m % 10;
        }
        m /= 10;
      }
      if (e == o) {
        return Z.valueOf(mN);
      }
    }
  }
}

