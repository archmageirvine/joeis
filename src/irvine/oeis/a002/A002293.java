package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002293 Number of dissections of a polygon: binomial(4*n, n)/(3*n + 1).
 * @author Sean A. Irvine
 */
public class A002293 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002293(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002293() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4L * mN, mN).divide(3L * mN + 1);
  }
}
