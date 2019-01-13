package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;

/**
 * A013687.
 * @author Sean A. Irvine
 */
public class A013687 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013687() {
    super(new A013669());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
