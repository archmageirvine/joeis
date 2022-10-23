package irvine.oeis.a009;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009195 a(n) = gcd(n, phi(n)).
 * @author Sean A. Irvine
 */
public class A009195 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Euler.phi(mN));
  }
}
