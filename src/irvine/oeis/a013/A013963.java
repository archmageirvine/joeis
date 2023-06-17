package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013963 a(n) = sigma_15(n), the sum of the 15th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013963 extends AbstractSequence {

  /** Construct the sequence. */
  public A013963() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(15);
  }
}
