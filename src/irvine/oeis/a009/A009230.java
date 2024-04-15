package irvine.oeis.a009;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009230 a(n) = lcm(n, d(n)).
 * @author Sean A. Irvine
 */
public class A009230 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(Functions.SIGMA0.z(mN));
  }
}
