package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a004.A004101;
import irvine.oeis.a025.A025487;

/**
 * A052305 Semisimple rings by prime signature: A038538(A025487).
 * @author Sean A. Irvine
 */
public class A052305 extends A025487 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004101());

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mA.a(fs.getExponent(p)));
    }
    return prod;
  }
}
