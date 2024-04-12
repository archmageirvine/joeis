package irvine.oeis.a000;

import irvine.factor.Sigma;
import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000203 a(n) = sigma(n), the sum of the divisors of n. Also called sigma_1(n).
 * @author Sean A. Irvine
 */
public class A000203 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000203(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000203() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Sigma.sigma(++mN));
  }

  @Override
  public Z a(final int n) {
    return Jaguar.factor(n).sigma();
  }

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).sigma();
  }
}
