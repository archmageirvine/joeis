package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013689 Continued fraction for zeta(13).
 * @author Sean A. Irvine
 */
public class A013689 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013689() {
    super(new A013671());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
