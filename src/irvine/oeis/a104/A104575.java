package irvine.oeis.a104;
// manually etman at 2023-02-01 22:30

import irvine.math.z.Z;
import irvine.oeis.a008.A008965;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A104575 Alternating sum of diagonals in A060177.
 * @author Georg Fischer
 */
public class A104575 extends EulerTransform {

  /** Construct the sequence. */
  public A104575() {
    super(0, new SimpleTransformSequence(new A008965(), Z::negate), 1);
  }
}
