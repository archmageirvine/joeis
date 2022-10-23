package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001055;

/**
 * A050336 Number of ways of factoring n with one level of parentheses.
 * @author Sean A. Irvine
 */
public class A050336 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001055());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    DirichletSeries series = DirichletSeries.ONE;
    for (int k = 2; k <= mN; ++k) {
      series = series.multiply(DirichletSeries.zeta(k, mN, Z.ONE).pow(mA.a(k - 1).intValueExact(), mN), mN);
    }
    return series.coeff(mN);
  }
}
