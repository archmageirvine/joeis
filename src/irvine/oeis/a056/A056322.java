package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056322 Number of primitive (aperiodic) reversible strings with n beads using exactly six different colors.
 * @author Sean A. Irvine
 */
public class A056322 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056322() {
    super(new A056313(), 0);
    next();
  }
}
