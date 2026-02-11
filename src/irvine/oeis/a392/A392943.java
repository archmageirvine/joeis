package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392943 a(n) is the number of integer-sided triangles whose area and circumradius are integers, and whose semiperimeter equals A392942(n).
 * @author Sean A. Irvine
 */
public class A392943 extends A392942 {

  @Override
  public Z next() {
    long cnt = 0;
    final long k = super.next().longValueExact();
    for (long x = 1; x <= 2 * k / 3; ++x) {
      for (long y = Math.max(x, k - x + 1); y <= k - x / 2; ++y) {
        final long z = 2 * k - x - y;
        final Z f = Z.valueOf(k).multiply(k - x).multiply(k - y).multiply(k - z);
        final Z s = f.sqrt();
        if (f.auxiliary() == 1 && !s.isZero()) {
          final Z mod = s.multiply(4);
          if (Z.valueOf(x).modMultiply(y, mod).modMultiply(z, mod).isZero()) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
