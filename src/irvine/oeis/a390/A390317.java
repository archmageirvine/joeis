package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390317 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A390317 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(Z.TWO.add(p.pow(e).add(p.pow(e - 1)).subtract(2).multiply(p.add(1)).divide(p.subtract(1))));
    }
    return prod;
  }
}
