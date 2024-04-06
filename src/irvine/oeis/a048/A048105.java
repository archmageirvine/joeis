package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A048105 Number of non-unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A048105 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma0().subtract(fs.unitarySigma0());
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma0().subtract(fs.unitarySigma0());
  }
}
