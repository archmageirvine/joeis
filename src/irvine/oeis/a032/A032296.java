package irvine.oeis.a032;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A032296 Number of aperiodic bracelets (turnover necklaces) with n beads of 5 colors.
 * @author Sean A. Irvine
 */
public class A032296 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A032296() {
    super(new A032276(), 0);
    next();
  }
}
