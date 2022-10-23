package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046660 Excess of n = number of prime divisors (with multiplicity) - number of prime divisors (without multiplicity).
 * @author Sean A. Irvine
 */
public class A046660 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Z.valueOf(fs.bigOmega() - fs.omega());
  }
}
