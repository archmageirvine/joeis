package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000166;
import irvine.oeis.memory.MemorySequence;

/**
 * A002629 Number of permutations of length n with one 3-sequence.
 * @author Sean A. Irvine
 */
public class A002629 extends Sequence1 {

  private final MemorySequence mD = MemorySequence.cachedSequence(new A000166());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 1; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - k - 2, k - 1).multiply(mD.a(mN - k)));
    }
    return sum;
  }
}
