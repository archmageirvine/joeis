package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050368 Number of ways to factor n into distinct factors with 2 kinds of 2, 3 kinds of 3, ...
 * @author Sean A. Irvine
 */
public class A050368 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    DirichletSeries series = DirichletSeries.ONE;
    for (int k = 2; k <= mN; ++k) {
      series = series.multiply(DirichletSeries.zetaNum(k, mN, Z.ONE).pow(k, mN), mN);
    }
    return series.coeff(mN);
  }
}
