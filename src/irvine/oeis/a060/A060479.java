package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a006.A006954;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A060479 Number of orbits of length n in map whose periodic points come from A006954.
 * @author Sean A. Irvine
 */
public class A060479 extends MobiusTransformSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A060479() {
    super(new A006954(), 2);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
