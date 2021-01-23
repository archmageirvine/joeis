package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023582 Number of distinct prime divisors of 2*prime(n)-1.
 * @author Sean A. Irvine
 */
public class A023582 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().multiply2().subtract(1)).omega());
  }
}
