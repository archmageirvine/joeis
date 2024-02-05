package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A008472 Sum of the distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A008472 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).sopf();
  }

  @Override
  public Z a(final int n) {
    return Jaguar.factor(n).sopf();
  }

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sopf();
  }
}
