package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037031 Number of combinations of n objects taken pi(n) at a time.
 * @author Sean A. Irvine
 */
public class A037031 extends A000720 {

  @Override
  public Z next() {
    final Z pi = super.next();
    return Binomial.binomial(mN, pi);
  }
}

