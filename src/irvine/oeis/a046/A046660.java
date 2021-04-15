package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046660 Excess of n = number of prime divisors (with multiplicity) - number of prime divisors (without multiplicity).
 * @author Sean A. Irvine
 */
public class A046660 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return Z.valueOf(fs.bigOmega() - fs.omega());
  }
}
