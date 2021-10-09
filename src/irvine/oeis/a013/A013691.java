package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013691 Continued fraction for zeta(15).
 * @author Sean A. Irvine
 */
public class A013691 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013691() {
    super(new A013673());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
