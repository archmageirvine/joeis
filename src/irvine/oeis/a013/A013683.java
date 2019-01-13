package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;

/**
 * A013683.
 * @author Sean A. Irvine
 */
public class A013683 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013683() {
    super(new A013665());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
