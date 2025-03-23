package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A036301.
 * @author Sean A. Irvine
 */
public class A076166 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      long m = p.longValueExact();
      long e = 0;
      long o = 0;
      while (m != 0) {
        final long r = m % 10;
        if ((m & 1) == 0) {
          e += r * r * r;
        } else {
          o += r * r * r;
        }
        m /= 10;
      }
      if (Math.abs(e - o) == 0) {
        return p;
      }
    }
  }
}

