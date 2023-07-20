package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001790;

/**
 * A046643 From square root of Riemann zeta function: form Dirichlet series Sum b_n/n^s whose square is zeta function; sequence gives numerator of b_n.
 * @author Sean A. Irvine
 */
public class A046643 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001790());
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
