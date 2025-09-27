package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a000.A000292;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A134481 Row sums of triangle A134480.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A134481 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A134481() {
    super(0, new A000292(), Z.FIVE::multiply);
  }
}
