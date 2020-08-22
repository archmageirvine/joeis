package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023513 a(n) = sum of distinct prime divisors of prime(n) + 1.
 * @author Sean A. Irvine
 */
public class A023513 extends A000040 {

  @Override
  public Z next() {
    return A023507.sum(Cheetah.factor(super.next().add(1)).toZArray());
  }
}
