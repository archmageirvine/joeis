package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008410 a(0) = 1, a(n) = 480*sigma_7(n).
 * @author Sean A. Irvine
 */
public class A008410 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008410(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008410() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Jaguar.factor(mN).sigma(7).multiply(480);
  }
}
