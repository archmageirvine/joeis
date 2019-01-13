package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000994.
 * @author Sean A. Irvine
 */
public class A000994 extends MemorySequence {

  private int mN = -3;

  @Override
  protected Z computeNext() {
    if (++mN <= 1) {
      return mN == -1 ? Z.ZERO : Z.ONE;
    }
    Z sum = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(get(k)));
    }
    return sum;
  }
}

