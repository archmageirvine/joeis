package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A292730 Numbers in which 0 outnumbers all other digits together.
 * @author Georg Fischer
 */
public class A292730 extends Sequence1 {

  private long mN = -1;
  private int mDigit;

  /** Construct the sequence. */
  public A292730() {
    this(0);
  }

  /**
   * Generic constructor with parameters
   * @param digit digit this digits outnumbers all other digits together.
   */
  public A292730(final int digit) {
    mDigit = digit;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] counts = ZUtils.digitCounts(++mN);
      int sum = 0;
      for (int i = 0; i < 10; ++i) {
        if (i != mDigit) {
          sum += counts[i];
        }
      }
      if (counts[mDigit] > sum) {
        return Z.valueOf(mN);
      }
    }
  }
}
