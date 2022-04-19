package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056320 Number of primitive (aperiodic) reversible strings with n beads using exactly four different colors.
 * @author Sean A. Irvine
 */
public class A056320 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056320() {
    super(new A056311(), 0);
    next();
  }
}
