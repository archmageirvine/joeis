package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064871 The minimal number which has multiplicative persistence 7 in base n.
 * @author Sean A. Irvine
 */
public class A064871 extends AbstractSequence {

  private static final long[] SMALL = {1409794, 68889, 38200, 17902874277L};
  private int mN = 8;

  /** Construct the sequence. */
  public A064871() {
    super(9);
  }

  @Override
  public Z next() {
    if (++mN > 5039) {
      return Z.valueOf(8L * mN - mN / 5040);
    } else if (mN - 9 < SMALL.length) {
      return Z.valueOf(SMALL[mN - 9]);
    } else {
      long m = 0;
      while (A064870.multiplicativePersistence(++m, mN, 7) != 7) {
        // do nothing
      }
      return Z.valueOf(m);
    }
  }
}

