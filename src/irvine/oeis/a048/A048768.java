package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A048768 Numbers n such that A048767(n) = n.
 * @author Sean A. Irvine
 */
public class A048768 extends Sequence1 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A000040());
  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(mPrimes.a(fs.getExponent(p) - 1).pow(mPi.a(p.intValueExact() - 1)));
      }
      if (prod.equals(mN)) {
        return mN;
      }
    }
  }
}
