package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056052 Number of 7-antichain covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A056052 extends AbstractSequence {

  /* Construct the sequence. */
  public A056052() {
    super(5);
  }

  private static final long[] MULTIPLIERS = {0, 720, -3528, 1764, 9744, -9744, 4410, -16016, 2940, 17640, 3500, -29820, 21000, 26250, -21420, -16485, -5810, -1540, 15750, 20580, -11340, -5040, -15050, -8120, 10080, 10500, -5040, 14490, 13860, -8540, -8400, -9905, -8652, -6300, 2982, 9240, 5880, 11130, -7560, 3360, 1260, -9660, 1680, -1260, 840, -5040, 0, 630, 0, 2940, -420, 840, 0, 840, 0, 2730, 0, 0, 0, -2520, 0, 0, 0, -819, 14, -84, 0, 210, 0, 0, 0, 140, 0, 0, 0, 0, 0, 0, 0, 210, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < MULTIPLIERS.length; ++k) {
      if (MULTIPLIERS[k] != 0) {
        sum = sum.add(Z.valueOf(k).pow(mN).multiply(MULTIPLIERS[k]));
      }
    }
    return sum.divide(5040);
  }
}
