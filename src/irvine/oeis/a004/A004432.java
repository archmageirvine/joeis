package irvine.oeis.a004;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004432 Numbers that are the sum of 3 distinct nonzero squares.
 * @author Sean A. Irvine
 */
public class A004432 extends AbstractSequence {

  /** Construct the sequence. */
  public A004432() {
    super(1);
  }

  // After M. F. Hasler

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long x = 1; 3 * x * x < mN; ++x) {
        final long u = mN - x * x;
        for (long y = x + 1; 2 * y * y < u; ++y) {
          final long z2 = u - y * y;
          final long z = LongUtils.sqrt(z2);
          if (z * z == z2) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
