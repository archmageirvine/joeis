package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.util.FactorSequence;
import irvine.factor.factor.Cheetah;

/**
 * A008475 If n = Product (p_j^k_j) then a(n) = Sum (p_j^k_j) (a(1) = 0 by convention).
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
