package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A081992 a(n) = count of numbers formed using the digits of next n numbers.
 * @author Sean A. Irvine
 */
public class A081992 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mN; ++k) {
      sb.append(++mM);
    }
    final int totalDigits = sb.length();
    final int[] counts = ZUtils.digitCounts(new Z(sb));
    // Slightly complicated because we need first digit to be nonzero
    Z sum = Z.ZERO;
    for (int k = 1; k < counts.length; ++k) {
      if (counts[k] > 0) {
        --counts[k];
        sum = sum.add(Binomial.multinomial(totalDigits - 1, counts));
        ++counts[k];
      }
    }
    return sum;
  }
}
