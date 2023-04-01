package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000720;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062537 extends MemorySequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A000720(), 0));
  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(a(mA.a(p.intValueExact()).intValueExact())).add(a(fs.getExponent(p)).add(1));
    }
    return sum;
  }
}
