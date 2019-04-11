package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008474 If <code>n =</code> Product (p_j^k_j) then <code>a(n) =</code> Sum (p_j + k_j).
 * @author Sean A. Irvine
 */
public class A008474 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 1) {
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.add(fs.getExponent(p)));
      }
    }
    return sum;
  }
}
