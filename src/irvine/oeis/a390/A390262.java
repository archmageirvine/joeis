package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390262 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A390262 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z pe1 = p.pow(fs.getExponent(p) - 1);
      prod = prod.multiply(p.add(1).square().multiply(pe1).subtract(2).multiply(pe1));
    }
    return prod;
  }
}
