package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008481 If n = Product (p_j^k_j) then a(n) = Sum partition(k_j).
 * @author Sean A. Irvine
 */
public class A008481 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(IntegerPartition.partitions(fs.getExponent(p)));
    }
    return sum;
  }
}
