package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393226 allocated for George B. Salomon.
 * @author Sean A. Irvine
 */
public class A393226 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z max = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final Z nd = mN.divide(d);
      max = max.max(d.pow(nd).subtract(nd.pow(d)));
    }
    return max;
  }
}
