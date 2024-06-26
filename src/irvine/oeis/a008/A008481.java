package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008481 If n = Product (p_j^k_j) then a(n) = Sum partition(k_j).
 * @author Sean A. Irvine
 */
public class A008481 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Functions.PARTITIONS.z(fs.getExponent(p)));
    }
    return sum;
  }
}
