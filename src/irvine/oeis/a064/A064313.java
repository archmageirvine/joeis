package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064313 Integer part of area of a regular polygon with n sides each of length 1.
 * @author Sean A. Irvine
 */
public class A064313 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ZERO;
    }
    final CR z = CR.valueOf(mN);
    return z.divide(ComputableReals.SINGLETON.tan(CR.PI.divide(z)).multiply(4)).floor();
  }
}
