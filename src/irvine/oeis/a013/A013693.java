package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013693 Continued fraction for zeta(17).
 * @author Sean A. Irvine
 */
public class A013693 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013693() {
    super(0, new A013675());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
