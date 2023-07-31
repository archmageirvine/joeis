package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064872 The minimal number which has multiplicative persistence 8 in base n.
 * @author Sean A. Irvine
 */
public class A064872 extends AbstractSequence {

  private static final long[] SMALL = {7577, 130883, 596667, 3644381};
  private int mN = 12;

  /** Construct the sequence. */
  public A064872() {
    super(13);
  }

  @Override
  public Z next() {
    if (++mN > 40319) {
      return Z.valueOf(9L * mN - mN / 40320);
    } else if (mN - 13 < SMALL.length) {
      return Z.valueOf(SMALL[mN - 13]);
    } else {
      long m = 0;
      while (A064870.multiplicativePersistence(++m, mN, 8) != 8) {
        // do nothing
      }
      return Z.valueOf(m);
    }
  }
}

