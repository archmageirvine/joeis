package irvine.oeis.a217;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000166;

/**
 * A217701 Permanent of the n X n matrix with all diagonal entries n and all off diagonal entries 1.
 * a(n) = Sum_{k=0..n} C(n,k)*D_{n-k}*n^k, where D_n = A000166(n).
 * @author Georg Fischer
 */
public class A217701 extends Sequence0 {

  private int mN = -1;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A000166());

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mSeq.a(mN - k)).multiply(Z.valueOf(mN).pow(k)));
    }
    return sum;
  }
}
