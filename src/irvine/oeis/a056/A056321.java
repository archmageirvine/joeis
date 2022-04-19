package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056321 Number of primitive (aperiodic) reversible strings with n beads using exactly five different colors.
 * @author Sean A. Irvine
 */
public class A056321 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056321() {
    super(new A056312(), 0);
    next();
  }
}
