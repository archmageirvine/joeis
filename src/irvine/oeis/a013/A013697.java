package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013697 Second term in continued fraction for <code>zeta(n)</code>.
 * @author Sean A. Irvine
 */
public class A013697 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Zeta.zeta(++mN).subtract(CR.ONE).inverse().floor(32);
  }
}
