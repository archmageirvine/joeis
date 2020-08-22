package irvine.oeis.a002;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002481 Numbers of form x^2 + 6y^2.
 * @author Sean A. Irvine
 */
public class A002481 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long q = 0, r; (r = mN - 6 * q * q) >= 0; ++q) {
        final long y = LongUtils.sqrt(r);
        if (y * y == r) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
