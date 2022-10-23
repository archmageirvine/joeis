package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001159 sigma_4(n): sum of 4th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A001159 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(4);
  }
}
