package irvine.oeis.a344;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A344203 Dirichlet g.f.: Product_{k&gt;=2} 1 / (1 - k^(-s))^binomial(k+2,3).
 * @author Sean A. Irvine
 */
public class A344203 extends Sequence1 {

  // %N A344203 Dirichlet g.f.: Product_{k>=2} 1 / (1 - k^(-s))^binomial(k+2,3).
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    DirichletSeries series = DirichletSeries.ONE;
    for (int k = 2; k <= mN; ++k) {
      series = series.multiply(DirichletSeries.zetap(k, mN, Z.ONE).pow(k * (k + 1) * (k + 2) / 6, mN), mN);
    }
    return series.coeff(mN);
  }
}

