package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A024975 Sums of three distinct positive cubes.
 * @author Sean A. Irvine
 */
public class A024975 extends AbstractSequence {

  /** Construct the sequence. */
  public A024975() {
    super(1);
  }

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long x = 1; 3 * x * x * x < mN; ++x) {
        final long u = mN - x * x * x;
        for (long y = x + 1; 2 * y * y * y < u; ++y) {
          final long v = u - y * y * y;
          final long s = Z.valueOf(v).root(3).longValueExact();
          if (s * s * s == v) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
