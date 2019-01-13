package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;

/**
 * A013685.
 * @author Sean A. Irvine
 */
public class A013685 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013685() {
    super(new A013667());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
