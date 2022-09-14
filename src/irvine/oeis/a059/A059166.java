package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001187;

/**
 * A059166 Number of n-node connected labeled graphs without endpoints.
 * @author Sean A. Irvine
 */
public class A059166 implements Sequence {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A001187());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(mC.a(mN - k).multiply(Z.valueOf(mN - k).pow(k))));
    }
    return sum.max(Z.ZERO);
  }
}
