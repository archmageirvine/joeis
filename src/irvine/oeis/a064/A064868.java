package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064868 The minimal number which has multiplicative persistence 4 in base n.
 * @author Sean A. Irvine
 */
public class A064868 extends AbstractSequence {

  private static final long[] SMALL = {2344, 172, 131, 174, 52, 77, 75, 83, 75, 81, 89, 95, 101, 104, 110, 133, 143, 127, 133};
  private long mN = 4;

  /** Construct the sequence. */
  public A064868() {
    super(5);
  }

  @Override
  public Z next() {
    if (++mN <= 23) {
      return Z.valueOf(SMALL[(int) (mN - 5)]);
    } else {
      return Z.valueOf(5L * mN - mN / 24);
    }
  }
}

