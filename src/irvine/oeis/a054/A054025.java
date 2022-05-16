package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054025 Sum of divisors of n read modulo (number of divisors of n).
 * @author Sean A. Irvine
 */
public class A054025 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma().mod(fs.sigma0());
  }
}

