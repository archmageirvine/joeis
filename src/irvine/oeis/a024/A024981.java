package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024981 Numbers that are the sum of 3 positive cubes, including repetitions.
 * @author Sean A. Irvine
 */
public class A024981 extends Sequence1 {

  private long mN = 2;
  private long mC = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long x = 1; 3 * x * x * x <= mN; ++x) {
        final long u = mN - x * x * x;
        for (long y = x; 2 * y * y * y <= u; ++y) {
          final long v = u - y * y * y;
          final long s = Z.valueOf(v).root(3).longValueExact();
          if (s * s * s == v) {
            ++mC;
          }
        }
      }
    }
    --mC;
    return Z.valueOf(mN);
  }
}
