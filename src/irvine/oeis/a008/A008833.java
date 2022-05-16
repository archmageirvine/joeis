package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008833 Largest square dividing n.
 * @author Sean A. Irvine
 */
public class A008833 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(fs.getExponent(p) / 2));
    }
    return prod.square();
  }
}


