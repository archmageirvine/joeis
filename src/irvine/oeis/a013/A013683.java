package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013683 Continued fraction for zeta(7).
 * @author Sean A. Irvine
 */
public class A013683 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013683() {
    super(0, new A013665());
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
