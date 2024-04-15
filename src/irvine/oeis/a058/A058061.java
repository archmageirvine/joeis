package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058061 Number of prime factors (counted with multiplicity) of d(n), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A058061 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Functions.SIGMA0.z(++mN)).bigOmega());
  }
}

