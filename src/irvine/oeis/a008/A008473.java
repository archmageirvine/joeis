package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008473.
 * @author Sean A. Irvine
 */
public class A008473 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    if (++mN > 1) {
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(p.add(fs.getExponent(p)));
      }
    }
    return prod;
  }
}
