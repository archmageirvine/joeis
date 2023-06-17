package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013959 a(n) = sigma_11(n), the sum of the 11th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013959 extends AbstractSequence {

  /** Construct the sequence. */
  public A013959() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(11);
  }
}
