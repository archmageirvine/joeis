package irvine.oeis.a032;

import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.a027.A027671;

/**
 * A032294 Number of aperiodic bracelets (turnover necklaces) with n beads of 3 colors.
 * @author Sean A. Irvine
 */
public class A032294 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A032294() {
    super(new A027671(), 1);
    next();
  }
}
