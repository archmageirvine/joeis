package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071384 Radii of the circles around (0,0) that contain record numbers of lattice points, rounded up to the next integer.
 * @author Sean A. Irvine
 */
public class A071384 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071384() {
    super(1, new A071383(), Functions.CEIL_SQRT::z);
  }
}
