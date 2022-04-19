package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056333 Number of primitive (aperiodic) reversible string structures with n beads using a maximum of four different colors.
 * @author Sean A. Irvine
 */
public class A056333 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056333() {
    super(new A056323(), 1);
    next();
  }
}
