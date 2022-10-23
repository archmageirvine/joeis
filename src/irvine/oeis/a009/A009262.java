package irvine.oeis.a009;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009262 a(n) = lcm(n, phi(n)).
 * @author Sean A. Irvine
 */
public class A009262 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(Euler.phi(mN));
  }
}
