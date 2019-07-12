package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000166;

/**
 * A002628 Number of permutations of length n without <code>3-sequences</code>.
 * @author Sean A. Irvine
 */
public class A002628 implements Sequence {

  private final MemorySequence mD = MemorySequence.cachedSequence(new A000166());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k).multiply(mD.a(mN - k).add(mD.a(mN - k - 1))));
    }
    return sum;
  }
}
