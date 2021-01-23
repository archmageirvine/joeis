package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A023521 Sum of distinct prime divisors of prime(n)*prime(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A023521 extends A023515 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A023507.sum(Cheetah.factor(super.next()).toZArray());
  }
}
