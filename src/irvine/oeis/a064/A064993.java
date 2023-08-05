package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a065.A065358;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064993 Values for which A065358 is smaller than any preceding term.
 * @author Sean A. Irvine
 */
public class A064993 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A064993() {
    super(1, new SimpleTransformSequence(new A065358(), Z::negate), 0, false);
    next();
  }
}
