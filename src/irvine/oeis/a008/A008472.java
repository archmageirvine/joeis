package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008472 Sum of the distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A008472 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sopf();
  }
}
