package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008334 Number of distinct primes dividing <code>p-1</code>, where p <code>= n-th</code> prime.
 * @author Sean A. Irvine
 */
public class A008334 extends A006093 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).omega());
  }
}


