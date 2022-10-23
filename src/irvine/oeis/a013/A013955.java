package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013955 a(n) = sigma_7(n), the sum of the 7th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013955 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(7);
  }
}
