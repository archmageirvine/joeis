package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023580 Sum of distinct prime divisors of prime(n)+3.
 * @author Sean A. Irvine
 */
public class A023580 extends A000040 {

  @Override
  public Z next() {
    return A023507.sum(Cheetah.factor(super.next().add(3)).toZArray());
  }
}
