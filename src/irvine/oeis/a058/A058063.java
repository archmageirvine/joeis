package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058063 Number of prime factors (when counted with multiplicity) of sigma(n), the sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A058063 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Jaguar.factor(++mN).sigma()).bigOmega());
  }
}

