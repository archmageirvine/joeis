package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045778;

/**
 * A050345 Number of ways to factor n into distinct factors with one level of parentheses.
 * @author Sean A. Irvine
 */
public class A050345 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A045778());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    DirichletSeries series = DirichletSeries.ONE;
    for (int k = 2; k <= mN; ++k) {
      series = series.multiply(DirichletSeries.zetaNum(k, mN, Z.ONE).pow(mA.a(k - 1).intValueExact(), mN), mN);
    }
    return series.coeff(mN);
  }
}
