package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A000994 Shifts 2 places left under binomial transform.
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
      sum = sum.add(Binomial.binomial(mN, k).multiply(a(k)));
    }
    return sum;
  }
}

