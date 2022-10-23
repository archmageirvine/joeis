package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033273 Number of nonprime divisors of n.
 * @author Sean A. Irvine
 */
public class A033273 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma0().subtract(fs.omega());
  }
}

