package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002884;

/**
 * A053722 Number of n X n binary matrices of order dividing 2 (also number of solutions to X^2=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053722 extends Sequence1 {

  private final MemorySequence mGamma = MemorySequence.cachedSequence(new A002884());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(mGamma.a(mN).divide(mGamma.a(k).multiply(mGamma.a(mN - 2 * k)).shiftLeft(k * (2L * mN - 3L * k))));
    }
    return sum;
  }
}
