package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;

/**
 * A006871 Exponentiation of g.f. for rooted trees.
 * @author Sean A. Irvine
 */
public class A006871 extends MemorySequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final Sequence mRootedTrees = new A000081();
  private int mN = -1;
  {
    add(Z.ONE);
    mRootedTrees.next();
  }

  @Override
  public Z computeNext() {
    ++mN;
    mA.add(mRootedTrees.next());
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mA.get(k)).multiply(get(mN - k)));
    }
    return sum;
  }
}
