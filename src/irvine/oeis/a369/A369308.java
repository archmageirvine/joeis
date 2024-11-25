package irvine.oeis.a369;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072950.
 * @author Sean A. Irvine
 */
public class A369308 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return DirichletSeries.zeta(++mN).substitute(2, mN).square(mN).coeff(mN);
  }
}

