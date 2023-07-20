package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000129;

/**
 * A006669 Exponentiation of g.f. for Pell numbers.
 * @author Sean A. Irvine
 */
public class A006669 extends MemorySequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final Sequence mPell = new A000129();
  private int mN = -1;
  {
    add(Z.ONE);
  }

  @Override
  public Z computeNext() {
    ++mN;
    mA.add(mPell.next());
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mA.get(k)).multiply(a(mN - k)));
    }
    return sum;
  }
}
