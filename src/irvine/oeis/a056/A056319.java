package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056319 Number of primitive (aperiodic) reversible strings with n beads using exactly three different colors.
 * @author Sean A. Irvine
 */
public class A056319 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056319() {
    super(new A056310(), 0);
    next();
  }
}
