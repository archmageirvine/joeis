package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a007.A007645;

/**
 * A001480.
 * @author Sean A. Irvine
 */
public class A001480 extends A007645 {

  @Override
  public Z next() {
    final Z p = super.next();
    final long pp = p.longValueExact();
    long y = 0;
    while (true) {
      final long y2 = 3 * y * y;
      final long r = pp - y2;
      final long s = LongUtils.sqrt(r);
      if (s * s == r) {
        return Z.valueOf(y);
      }
      ++y;
    }
  }
}

