package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056335 Number of primitive (aperiodic) reversible string structures with n beads using a maximum of six different colors.
 * @author Sean A. Irvine
 */
public class A056335 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056335() {
    super(new A056325(), 1);
    next();
  }
}
