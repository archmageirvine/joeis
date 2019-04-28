package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055734 Number of distinct primes dividing phi(n).
 * @author Sean A. Irvine
 */
public class A055734 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(Cheetah.factor(++mN).phi()).omega());
  }
}
