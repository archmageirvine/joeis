package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013962 a(n) = sigma_14(n), the sum of the 14th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013962 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(14);
  }
}
