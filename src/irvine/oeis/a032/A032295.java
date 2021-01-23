package irvine.oeis.a032;

import irvine.oeis.MobiusTransformSequence;

/**
 * A032295 Number of aperiodic bracelets (turn over necklaces) with n beads of 4 colors.
 * @author Sean A. Irvine
 */
public class A032295 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A032295() {
    super(new A032275(), 0);
    next();
  }
}
