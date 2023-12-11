package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004101;
import irvine.oeis.memory.MemorySequence;

/**
 * A038538 Number of semisimple rings with n elements.
 * @author Sean A. Irvine
 */
public class A038538 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004101());
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mA.a(fs.getExponent(p)));
    }
    return prod;
  }
}
