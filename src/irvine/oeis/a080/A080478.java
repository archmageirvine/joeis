package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a062.A062067;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080454.
 * @author Sean A. Irvine
 */
public class A080478 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080478() {
    super(1, new A062067(), Z::sqrt);
  }
}

