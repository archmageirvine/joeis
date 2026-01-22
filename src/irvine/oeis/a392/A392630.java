package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a154.A154402;

/**
 * A068869.
 * @author Sean A. Irvine
 */
public class A392630 extends Sequence1 {

  private final DirectSequence mA = new A154402();
  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mA.a(fs.getExponent(p)));
    }
    return prod;
  }
}
