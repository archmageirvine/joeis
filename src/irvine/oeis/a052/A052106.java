package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052106 a(n) = lcm(n, n - phi(n)).
 * @author Sean A. Irvine
 */
public class A052106 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(mN.subtract(Functions.PHI.z(mN)));
  }
}
