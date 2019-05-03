package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008477 If <code>n =</code> Product <code>(p_j^k_j)</code> then <code>a(n) =</code> Product <code>(k_j^p_j)</code>.
 * @author Sean A. Irvine
 */
public class A008477 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    if (++mN > 1) {
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(Z.valueOf(fs.getExponent(p)).pow(p));
      }
    }
    return prod;
  }
}
