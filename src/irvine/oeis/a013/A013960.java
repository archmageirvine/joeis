package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013960 a(n) = sigma_12(n), the sum of the 12th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013960 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(12);
  }
}
