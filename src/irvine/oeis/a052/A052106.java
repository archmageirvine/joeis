package irvine.oeis.a052;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052106 a(n) = lcm(n, n - phi(n)).
 * @author Sean A. Irvine
 */
public class A052106 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(mN.subtract(Euler.phi(mN)));
  }
}
