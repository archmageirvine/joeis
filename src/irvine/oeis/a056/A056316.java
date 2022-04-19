package irvine.oeis.a056;

import irvine.oeis.a032.A032122;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056316 Number of primitive (aperiodic) reversible strings with n beads using a maximum of five different colors.
 * @author Sean A. Irvine
 */
public class A056316 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056316() {
    super(new A032122(), 1);
    next();
  }
}
