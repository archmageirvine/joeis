package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001160 sigma_5(n), the sum of the 5th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A001160 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(5);
  }
}
