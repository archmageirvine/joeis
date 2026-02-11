package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392942 Distinct semiperimeters of triangles with integer sides, integer area, and integer circumradius.
 * @author Sean A. Irvine
 */
public class A392942 extends Sequence1 {

  private long mA = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 12;
      return Z.valueOf(12);
    }
    while (true) {
      ++mA;
      for (long x = 1; x <= 2 * mA / 3; ++x) {
        for (long y = Math.max(x, mA - x + 1); y <= mA - x / 2; ++y) {
          final long z = 2 * mA - x - y;
          final Z f = Z.valueOf(mA).multiply(mA - x).multiply(mA - y).multiply(mA - z);
          final Z s = f.sqrt();
          if (f.auxiliary() == 1 && !s.isZero()) {
            final Z mod = s.multiply(4);
            if (Z.valueOf(x).modMultiply(y, mod).modMultiply(z, mod).isZero()) {
              return Z.valueOf(mA);
            }
          }
        }
      }
    }
  }
}
