package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000081;

/**
 * A006871 Exponentiation of g.f. for rooted trees.
 * @author Sean A. Irvine
 */
public class A006871 extends MemorySequence {

  private final MemorySequence mRootedTrees = new A000081();
  private int mN = -1;
  {
    add(Z.ONE);
  }

  @Override
  public Z computeNext() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mRootedTrees.a(k + 1)).multiply(a(mN - k)));
    }
    return sum;
  }
}
