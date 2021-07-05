package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048785 a(0) = 0; a(n) = tau(n^3), where tau = number of divisors (A000005).
 * @author Sean A. Irvine
 */
public class A048785 implements Sequence {

  private final Cheetah mFactor = new Cheetah();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final FactorSequence fs = new FactorSequence();
    fs.add(mN, FactorSequence.UNKNOWN, 3);
    mFactor.factor(fs);
    return fs.sigma0();
  }
}
