package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A007854 G.f.: <code>1/(1 -</code> 3*x*C(x)), where C(x) <code>= (1 - sqrt(1 - 4*x))/(2*x) =</code> g.f. for the Catalan numbers A000108.
 * @author Sean A. Irvine
 */
public class A007854 extends A000108 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(9).subtract(super.next().multiply(3)).divide2();
    return mA;
  }
}
