package irvine.oeis.a006;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006081 Number of line-rooted projective plane trees with n nodes.
 * @author Sean A. Irvine
 */
public class A006081 extends MemoryFunction1<Z> implements Sequence {

  private static final class BFunction extends MemoryFunction1<Z> {

    @Override
    protected Z compute(final int n) {
      return Binomial.binomial(n, n / 2);
    }
  }

  private final BFunction mB = new BFunction();
  private int mN = -1;

  @Override
  protected Z compute(final int n) {
    return Binomial.binomial(2L * n, n).divide(n + 1);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(get(k).multiply(get(mN - k)).add(mB.get(k).multiply(mB.get(mN - k))));
    }
    if ((mN & 1) == 0) {
      sum = sum.add(get(mN / 2).multiply2());
    }
    return sum.divide(4);
  }

}
