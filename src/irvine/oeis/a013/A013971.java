package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013971 a(n) = sigma_23(n), the sum of the 23rd powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013971 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A013971(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A013971() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(23);
  }
}
