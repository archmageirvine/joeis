package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063749 a(n) = floor(d(n)*(n+1)/2) - sigma(n), where d = A000005, sigma = A000203.
 * @author Sean A. Irvine
 */
public class A063749 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma0().multiply(mN + 1).divide2().subtract(fs.sigma());
  }
}
