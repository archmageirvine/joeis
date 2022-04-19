package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056334 Number of primitive (aperiodic) reversible string structures with n beads using a maximum of five different colors.
 * @author Sean A. Irvine
 */
public class A056334 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056334() {
    super(new A056324(), 1);
    next();
  }
}
