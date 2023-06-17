package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000397 Number of partitions into non-integral powers.
 * @author Sean A. Irvine
 */
public class A000397 extends AbstractSequence {

  /** Construct the sequence. */
  public A000397() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long x = 1; x <= mN * (long) mN; ++x) {
      final double v = mN - Math.sqrt(x);
      final long lim = (long) Math.floor(v * v);
      for (long y = x + 1; y <= lim; ++y) {
        final double z = v - Math.sqrt(y);
        final double z2 = z * z;
        if (Math.floor(z2) >= y + 1) {
          s = s.add((long) Math.floor(z2 - y));
        }
      }
    }
    return s;
  }
}

