package irvine.oeis.a071;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a004.A004018;

/**
 * A071383 Squared radii of the circles around (0,0) that contain record numbers of lattice points.
 * @author Sean A. Irvine
 */
public class A071383 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A071383() {
    super(1, new A004018(), 0);
  }
}
