package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008917 Numbers that are the sum of 3 positive cubes in more than one way.
 * @author Sean A. Irvine
 */
public class A008917 implements Sequence {

  private long mN = 250;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int count = 0;
      long s;
      for (long a = 1; (s = a * a * a) < mN - 1; ++a) {
        final long m = mN - s;
        long t;
        for (long b = 1; b <= a && (t = b * b * b) < m; ++b) {
          final long o = m - t;
          long u;
          for (long c = 1; c <= b && (u = c * c * c) <= o; ++c) {
            if (u == o && ++count > 1) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

