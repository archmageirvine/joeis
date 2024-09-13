package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072168 Floor of ratio of volume of n-dimensional cube of side 2 to volume of n-dimensional ball of radius 1.
 * @author Sean A. Irvine
 */
public class A072168 extends Sequence0 {

  private static final CR SQRT_PI = CR.PI.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(new Q(++mN + 2, 2)).gamma().multiply(Z.ONE.shiftLeft(mN)).divide(SQRT_PI.pow(mN)).floor();
  }
}
