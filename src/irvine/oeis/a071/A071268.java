package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071268 extends Sequence1 {

  private long mN = 0;
  private final int[] mDigitCounts = new int[10];

  @Override
  public Z next() {
    final int[] c = ZUtils.digitCounts(++mN);
    int total = 0;
    for (int k = 0; k < c.length; ++k) {
      mDigitCounts[k] += c[k];
      total += mDigitCounts[k];
    }
    return Binomial.multinomial(total, mDigitCounts)
      .multiply(Integers.SINGLETON.sum(1, 9, k -> Z.valueOf(mDigitCounts[k]).multiply(k)))
      .multiply(Z.TEN.pow(total).subtract(1).divide(9))
      .divide(total);
  }
}
