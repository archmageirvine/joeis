package irvine.oeis.a281;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A281959 a(n) = sigma_25(n), the sum of the 25th powers of the divisors of n.
 * @author Georg Fischer
 */
public class A281959 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(25);
  }
}
