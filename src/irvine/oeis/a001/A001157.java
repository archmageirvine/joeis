package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001157 a(n) = sigma_2(n): sum of squares of divisors of n.
 * @author Sean A. Irvine
 */
public class A001157 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(2);
  }
}
