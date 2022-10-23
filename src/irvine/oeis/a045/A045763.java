package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045763 Number of numbers "unrelated to n": m &lt; n such that m is neither a divisor of n nor relatively prime to n.
 * @author Sean A. Irvine
 */
public class A045763 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Z.valueOf(mN + 1).subtract(fs.sigma0()).subtract(fs.phi());
  }
}
