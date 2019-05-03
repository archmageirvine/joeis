package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.util.FactorSequence;
import irvine.factor.factor.Cheetah;

/**
 * A008475 If <code>n =</code> Product <code>(p_j^k_j)</code> then <code>a(n) =</code> Sum <code>(p_j^k_j) (a(1) = 0</code> by convention).
 * @author Sean A. Irvine
 */
public class A008475 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 1) {
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(fs.getExponent(p)));
      }
    }
    return sum;
  }
}
