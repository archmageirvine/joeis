package irvine.oeis.a369;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A369308 The number of square divisors d of n such that n/d is also a square.
 * @author Sean A. Irvine
 */
public class A369308 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return DirichletSeries.zeta(++mN).substitute(2, mN).square(mN).coeff(mN);
  }
}

