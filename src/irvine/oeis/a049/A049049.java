package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A049049 a(n)! == 1 (mod A049048(n)).
 * @author Sean A. Irvine
 */
public class A049049 extends A002808 {

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
          return Z.valueOf(m);
        }
      }
    }
  }
}
