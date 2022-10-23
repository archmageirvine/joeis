package irvine.oeis.a055;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055034 a(1) = 1, a(n) = phi(2*n)/2 for n&gt;1.
 * @author Sean A. Irvine
 */
public class A055034 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    return Euler.phi(mN).add(1).divide2();
  }
}
