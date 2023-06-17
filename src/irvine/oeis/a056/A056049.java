package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056049 Number of 6-antichain covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A056049 extends AbstractSequence {

  /* Construct the sequence. */
  public A056049() {
    super(4);
  }

  private static final long[] MULTIPLIERS = {0, 120, -548, 274, 1350, -1350, 510, -1815, 340, 2040, 300, -2820, 1800, 2250, -1820, -1535, -210, 60, 750, 1380, -540, -240, -720, -480, 360, 480, 120, 810, 0, -720, 0, -345, -12, 60, 0, 60, 0, 0, 0, 120, 0, 0, 0, 0, 0, 0, 0, -30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < MULTIPLIERS.length; ++k) {
      if (MULTIPLIERS[k] != 0) {
        sum = sum.add(Z.valueOf(k).pow(mN).multiply(MULTIPLIERS[k]));
      }
    }
    return sum.divide(720);
  }
}
