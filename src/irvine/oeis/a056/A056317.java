package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056317 Number of primitive (aperiodic) reversible strings with n beads using a maximum of six different colors.
 * @author Sean A. Irvine
 */
public class A056317 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056317() {
    super(new A056308(), 1);
    next();
  }
}
