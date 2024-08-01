package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071610 Integer radii of the spheres around (0,0,0) that contain record numbers of lattice points.
 * @author Sean A. Irvine
 */
public class A071610 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071610() {
    super(new A071609(), Functions.CEIL_SQRT::z);
  }
}
