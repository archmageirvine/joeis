package irvine.oeis.a060;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060965 For p=prime(n), a(n) = number of points (x,y) on the elliptic curve x^3 + y^3 = 1 (mod p), including the point at infinity.
 * @author Sean A. Irvine
 */
public class A060965 extends A000040 {

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    long cnt = 1; // pt at infinity
    final long p = super.next().longValueExact();
    for (long x = 0; x < p; ++x) {
      final long xm = LongUtils.modPow(x, 3, p);
      for (long y = 0; y <= x; ++y) {
        final long ym = LongUtils.modPow(y, 3, p);
        if ((xm + ym) % p == 1) {
          cnt += y == x ? 1 : 2;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

