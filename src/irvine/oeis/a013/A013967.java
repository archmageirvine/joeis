package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013967 a(n) = sigma_19(n), the sum of the 19th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013967 extends AbstractSequence {

  /** Construct the sequence. */
  public A013967() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(19);
  }
}
