package irvine.oeis.a071;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a005.A005875;

/**
 * A071609 Squared radii of the spheres around (0,0,0) that contain record numbers of lattice points.
 * @author Georg Fischer
 */
public class A071609 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A071609() {
    super(new A005875().skip(), 1, false);
  }
}
