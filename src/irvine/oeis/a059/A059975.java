package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A059975 a(n) is the least number of prime factors (counted with multiplicity) of any integer with n divisors.
 * @author Sean A. Irvine
 */
public class A059975 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sopfr().subtract(fs.bigOmega());
  }
}
