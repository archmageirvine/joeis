package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086981 a(n) = smallest k where (10^k+1)=0 mod prime(n)^2, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A086981 extends A000040 {

  @Override
  public Z next() {
    final long p2 = super.next().square().longValueExact();
    for (long k = 1, f = 1; k < p2; ++k) {
      f *= 10;
      f %= p2;
      if (f == p2 - 1) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
