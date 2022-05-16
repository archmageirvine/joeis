package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054015 a(n) is Chowla function of n read modulo (number of proper divisors of n), a(1) = 0 by convention.
 * @author Sean A. Irvine
 */
public class A054015 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.sigma().subtract(mN + 1).mod(fs.sigma0().subtract(1));
  }
}
