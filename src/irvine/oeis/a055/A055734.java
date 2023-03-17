package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055734 Number of distinct primes dividing phi(n).
 * @author Sean A. Irvine
 */
public class A055734 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Euler.phi(++mN)).omega());
  }
}
