package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;

/**
 * A013689.
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
