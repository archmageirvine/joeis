package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A048676 Binary encoding of factorizations, alternative 2, a(n) = bef2(n);.
 * @author Sean A. Irvine
 */
public class A048676 extends Sequence1 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Z.ONE.shiftLeft(fs.getExponent(p) + mPrimePi.a(p.intValueExact() - 1).longValueExact()));
    }
    return sum.divide(4);
  }
}

