package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a009.A009421;

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
        if (A009421.isCube(Z.valueOf(mN - t))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
