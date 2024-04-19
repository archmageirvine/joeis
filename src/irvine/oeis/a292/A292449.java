package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A292449 Numbers where 9 outnumbers any other digit.
 * @author Georg Fischer
 */
public class A292449 extends Sequence1 {

  private long mN = -1;
  private final int mDigit;

  /** Construct the sequence. */
  public A292449() {
    this(9);
  }

  /**
   * Generic constructor with parameters
   * @param digit this digits outnumbers any other
   */
  public A292449(final int digit) {
    mDigit = digit;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] counts = ZUtils.digitCounts(++mN);
      final int max = counts[mDigit];
      boolean busy = true;
      int i = 10;
      while (busy && --i >= 0) {
        if (i != mDigit && counts[i] >= max) {
          busy = false;
        }
      }
      if (busy) {
        return Z.valueOf(mN);
      }
    }
  }
}
