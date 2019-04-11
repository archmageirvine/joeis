package irvine.oeis.a009;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009195 <code>a(n) =</code> gcd(n, phi(n)).
 * @author Sean A. Irvine
 */
public class A009195 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Euler.phi(mN));
  }
}
