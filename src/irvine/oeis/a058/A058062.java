package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058062 Number of distinct prime factors of sigma(n), the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A058062 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Jaguar.factor(++mN).sigma()).omega());
  }
}

