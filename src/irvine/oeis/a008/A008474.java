package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008474 If n = Product (p_j^k_j) then a(n) = Sum (p_j + k_j).
 * @author Sean A. Irvine
 */
public class A008474 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 1) {
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.add(fs.getExponent(p)));
      }
    }
    return sum;
  }
}
