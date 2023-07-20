package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000045;

/**
 * A006701 Exponentiation of g.f. for Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A006701 extends MemorySequence {

  private final MemorySequence mFibonacci = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;
  {
    add(Z.ONE);
  }

  @Override
  public Z computeNext() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mFibonacci.a(k)).multiply(a(mN - k)));
    }
    return sum;
  }
}
