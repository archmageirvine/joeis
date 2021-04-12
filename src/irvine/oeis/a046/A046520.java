package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046520 a(n) = (sum of divisors of n) - phi(n) - (number of divisors of n).
 * @author Sean A. Irvine
 */
public class A046520 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return fs.sigma().subtract(fs.phi()).subtract(fs.sigma0());
  }
}

