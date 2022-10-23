package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A102670 Number of digits &gt;= 2 in the decimal representations of all integers from 0 to n.
 * @author Georg Fischer
 */
public class A102670 extends Sequence0 {

  private int mN;
  private final int mGeDigit;
  private Z mSum;

  /** Construct the sequence. */
  public A102670() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param geDigit count the digits &gt;= this digit
   */
  public A102670(final int geDigit) {
    mN = -1;
    mGeDigit = geDigit;
    mSum = Z.ZERO;
  }

  @Override
  public Z next() {
    final int[] counts = ZUtils.digitCounts(++mN);
    int sum = 0;
    for (int dig = mGeDigit; dig <= 9; ++dig) {
      sum += counts[dig];
    }
    mSum = mSum.add(sum);
    return mSum;
  }
}
