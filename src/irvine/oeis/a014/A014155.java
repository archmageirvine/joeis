package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A014155 Sum of a nonnegative cube and a triangular number.
 * @author Sean A. Irvine
 */
public class A014155 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long t;
      for (long k = 0; (t = k * (k + 1) / 2) <= mN; ++k) {
        if (ZUtils.isCube(Z.valueOf(mN - t))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
