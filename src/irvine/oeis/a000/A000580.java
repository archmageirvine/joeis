package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000580 a(n) = binomial coefficient C(n,7).
 * @author Sean A. Irvine
 */
public class A000580 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000580(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000580() {
    super(7);
  }

  private int mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 7);
  }
}

