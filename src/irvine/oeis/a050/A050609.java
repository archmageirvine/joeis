package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A050609 Table T(n,k) = Sum_{i=0..2n} (C(2n,i) mod 2)*F(i+k) = Sum_{i=0..n} (C(n,i) mod 2)*F(2i+k).
 * @author Sean A. Irvine
 */
public class A050609 extends Sequence0 {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(mF.a(2 * k + m).multiply(Binomial.binomial(n, k, 2)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
