package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023589 Number of distinct prime divisors of <code>2*p(n)+1</code>.
 * @author Sean A. Irvine
 */
public class A023589 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().multiply2().add(1)).omega());
  }
}
