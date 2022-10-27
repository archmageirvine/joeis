package irvine.oeis.a071;
// manually deris at 2021-10-28 22:51

import irvine.oeis.RecordPositionSubsequence;
import irvine.oeis.a005.A005875;

/**
 * A071609 Squared radii of the spheres around (0,0,0) that contain record numbers of lattice points.
 *
 * @author Georg Fischer
 */
public class A071609 extends RecordPositionSubsequence {

  /** Construct the sequence. */
  public A071609() {
    super(0, new A005875());
    next();
  }
}
