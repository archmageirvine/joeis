package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050367 Number of ways to factor n into 2 kinds of 2, 3 kinds of 3, ...
 * @author Sean A. Irvine
 */
public class A050367 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    DirichletSeries series = DirichletSeries.ONE;
    for (int k = 2; k <= mN; ++k) {
      series = series.multiply(DirichletSeries.zetap(k, mN, Z.ONE).pow(k, mN), mN);
    }
    return series.coeff(mN);
  }
}
