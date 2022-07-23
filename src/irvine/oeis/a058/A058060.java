package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058060 Number of distinct prime factors of d(n), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A058060 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Jaguar.factor(++mN).sigma0()).omega());
  }
}

