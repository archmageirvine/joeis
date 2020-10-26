package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036301 Numbers n such that sum of even digits of n equals sum of odd digits of n.
 * @author Sean A. Irvine
 */
public class A036301 implements Sequence {

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

