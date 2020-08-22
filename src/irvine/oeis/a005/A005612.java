package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005612 Number of Boolean functions of n variables that are variously called "unate cascades" or "1-decision list functions" or "read-once threshold functions".
 * @author Sean A. Irvine
 */
public class A005612 extends MemoryFunction1<Z> implements Sequence {

  @Override
  protected Z compute(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(get(n - k)));
    }
    return sum;
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    return get(mN).subtract(get(mN - 1).multiply(mN)).shiftLeft(mN + 1);
  }
}
