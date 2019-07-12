package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000182;

/**
 * A005801 Generalized tangent numbers of type <code>3^(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A005801 implements Sequence {

  private final MemorySequence mA000182 = MemorySequence.cachedSequence(new PrependSequence(new A000182(), 0));
  private Z mA = Z.THREE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(9);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * mN + 1; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(2 * mN + 1, k).multiply(mA000182.a(mN + k + 1)).shiftRight(k));
    }
    return sum.divide(mA);
  }
}
