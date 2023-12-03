package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A067099 Floor[radius of the circumscribed circle of a regular n-gon with unit sides].
 * @author Sean A. Irvine
 */
public class A067099 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return CR.PI.divide(CR.valueOf(++mN)).sin().multiply(2).inverse().floor();
  }
}
