package irvine.oeis.a056;

import irvine.oeis.a032.A032121;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056315 Number of primitive (aperiodic) reversible strings with n beads using a maximum of four different colors.
 * @author Sean A. Irvine
 */
public class A056315 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056315() {
    super(new A032121(), 1);
    next();
  }
}
