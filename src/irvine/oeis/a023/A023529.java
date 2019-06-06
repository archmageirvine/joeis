package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A023529 Sum of distinct prime divisors of <code>p(n)*p(n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023529 extends A023523 {

  @Override
  public Z next() {
    return A023507.sum(Cheetah.factor(super.next()).toZArray());
  }
}
