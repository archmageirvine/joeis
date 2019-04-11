package irvine.oeis.a009;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009262 <code>a(n) =</code> lcm(n, phi(n)).
 * @author Sean A. Irvine
 */
public class A009262 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(Euler.phi(mN));
  }
}
