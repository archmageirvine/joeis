package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A078142 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      sum = sum.add(Functions.CEIL_SQRT.z(p).square().subtract(p));
    }
    return sum;
  }
}
