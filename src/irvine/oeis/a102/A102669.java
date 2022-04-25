package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A102669 Number of digits &gt;= 2 in decimal representation of n.
 * @author Georg Fischer
 */
public class A102669 implements Sequence {

  private int mN;
  private int mGeDigit;

  /** Construct the sequence. */
  public A102669() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param geDigit count the digits &gt;= this digit
   */
  public A102669(final int geDigit) {
    mN = -1;
    mGeDigit = geDigit;
  }

  @Override
  public Z next() {
    final int[] counts = ZUtils.digitCounts(++mN);
    int sum = 0;
    for (int dig = mGeDigit; dig <= 9; ++dig) {
      sum += counts[dig];
    }
    return Z.valueOf(sum);
  }
}
