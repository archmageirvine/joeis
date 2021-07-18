package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A049048 Composite numbers n such that k! == 1 (mod n) for some k &gt; 2.
 * @author Sean A. Irvine
 */
public class A049048 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z cc = super.next();
      final long c = cc.longValueExact();
      long f = 1;
      long m = 1;
      while (f != 0) {
        f *= ++m;
        f %= c;
        if (f == 1) {
          return cc;
        }
      }
    }
  }
}
