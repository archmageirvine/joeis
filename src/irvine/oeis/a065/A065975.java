package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065975 Denominators in expansion of (exp(x)-1)^3.
 * @author Sean A. Irvine
 */
public class A065975 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return new Q(Stirling.secondKind(++mN, 3).multiply(6), Functions.FACTORIAL.z(mN)).den();
  }
}
