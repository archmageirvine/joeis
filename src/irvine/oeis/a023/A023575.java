package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023575 Number of distinct prime divisors of prime(n)+3.
 * @author Sean A. Irvine
 */
public class A023575 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().add(3)).omega());
  }
}
