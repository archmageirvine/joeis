package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005187;

/**
 * A046644 From square root of Riemann zeta function: form Dirichlet series Sum b_n/n^s whose square is zeta function; sequence gives denominator of b_n.
 * @author Sean A. Irvine
 */
public class A046644 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A005187());
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Z.ONE.shiftLeft(mA.a(fs.getExponent(p)).longValueExact()));
    }
    return prod;
  }
}
