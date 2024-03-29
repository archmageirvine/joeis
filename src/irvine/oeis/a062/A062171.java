package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062171 Number of non-unitary divisors of n (A048105) &gt; number of distinct prime divisors of n (A001221).
 * @author Sean A. Irvine
 */
public class A062171 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().subtract(fs.unitarySigma0()).compareTo(Z.valueOf(fs.omega())) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
