package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059951.
 * @author Sean A. Irvine
 */
public class A059972 implements Sequence {

  private int mN = 0;

  private boolean is01(long m, final long base) {
    while (m != 0) {
      if (m % base > 1) {
        return false;
      }
      m /= base;
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long m = 1;
    while (true) {
      ++m;
      int cnt = 1; // base_m(m) = 1
      for (long b = 2; b < m; ++b) {
        if (is01(m, b) && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(m);
      }
    }
  }
}
