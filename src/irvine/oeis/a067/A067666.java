package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067633.
 * @author Sean A. Irvine
 */
public class A067666 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p.square().multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
