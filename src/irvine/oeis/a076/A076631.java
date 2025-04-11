package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076631 Solve 2^n - 2 = 7(x^2 - x) + (y^2 - y) for (x,y) with x&gt;0, y&gt;0; a(n) = value of y.
 * @author Sean A. Irvine
 */
public class A076631 extends Sequence1 {

  private static final CR T = ComputableReals.SINGLETON.atan(CR.SEVEN.sqrt());
  private long mN = 0;

  @Override
  public Z next() {
    return T.multiply(++mN).cos().abs().multiply(CR.valueOf(Z.ONE.shiftLeft(mN)).sqrt()).add(CR.HALF).assumeInt().toZ();
  }
}
