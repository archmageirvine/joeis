package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001790 Numerators in expansion of 1/sqrt(1-x).
 * @author Sean A. Irvine
 */
public class A001790 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001790(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001790() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return new Q(Binomial.binomial(2L * ++mN, mN), Z.ONE.shiftLeft(2L * mN)).num();
  }
}
