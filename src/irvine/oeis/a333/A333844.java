package irvine.oeis.a333;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333844 G.f.: Sum_{k&gt;=1} k * x^(k^4) / (1 - x^(k^4)).
 * @author Sean A. Irvine
 */
public class A333844 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final DirichletSeries z = DirichletSeries.zeta(++mN);
    return z.multiply(z.shift().substitute(4, mN), mN).coeff(mN);
  }
}

