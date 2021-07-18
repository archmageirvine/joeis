package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049047 Number of distinct factorial numbers congruent to 1 (mod prime(n)).
 * @author Sean A. Irvine
 */
public class A049047 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 1;
    long f = 1;
    long m = 1;
    while (f != 0) {
      f *= ++m;
      f %= p;
      if (f == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
