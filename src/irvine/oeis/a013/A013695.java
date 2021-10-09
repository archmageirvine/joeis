package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013695 Continued fraction for zeta(19).
 * @author Sean A. Irvine
 */
public class A013695 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013695() {
    super(new A013677());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
