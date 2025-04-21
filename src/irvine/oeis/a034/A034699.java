package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A034699 Largest prime power factor of n.
 * @author Sean A. Irvine
 */
public class A034699 extends Sequence1 implements DirectSequence {

  protected int mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    Z result = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      result = result.max(p.pow(fs.getExponent(p)));
    }
    return result;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
