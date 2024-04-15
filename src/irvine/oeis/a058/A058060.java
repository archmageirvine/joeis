package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058060 Number of distinct prime factors of d(n), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A058060 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Functions.SIGMA0.z(++mN)).omega());
  }
}

