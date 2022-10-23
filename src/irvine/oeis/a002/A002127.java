package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A002127 MacMahon's generalized sum of divisors function.
 * @author Sean A. Irvine
 */
public class A002127 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma(3).subtract(fs.sigma().multiply(2 * mN - 1)).divide(8);
  }
}
