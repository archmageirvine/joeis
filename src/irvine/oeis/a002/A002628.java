package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000166;
import irvine.oeis.memory.MemorySequence;

/**
 * A002628 Number of permutations of length n without 3-sequences.
 * @author Sean A. Irvine
 */
public class A002628 extends Sequence0 {

  private final MemorySequence mD = MemorySequence.cachedSequence(new A000166());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k).multiply(mD.a(mN - k).add(mD.a(mN - k - 1))));
    }
    return sum;
  }
}
