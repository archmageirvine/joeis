package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024973 Sum of three distinct positive cubes, including repetitions (first differs from <code>A024975</code> at <code>1009)</code>.
 * @author Sean A. Irvine
 */
public class A024973 implements Sequence {

  private long mN = 2;
  private long mC = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long x = 1; 3 * x * x * x < mN; ++x) {
        final long u = mN - x * x * x;
        for (long y = x + 1; 2 * y * y * y < u; ++y) {
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
