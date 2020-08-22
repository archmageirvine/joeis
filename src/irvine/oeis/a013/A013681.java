package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;

/**
 * A013681 Continued fraction for zeta(5).
 * @author Sean A. Irvine
 */
public class A013681 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013681() {
    super(new A013663());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
