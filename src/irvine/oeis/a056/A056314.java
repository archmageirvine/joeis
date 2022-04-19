package irvine.oeis.a056;

import irvine.oeis.a032.A032120;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056314 Number of primitive (aperiodic) reversible strings with n beads using a maximum of three different colors.
 * @author Sean A. Irvine
 */
public class A056314 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056314() {
    super(new A032120(), 1);
    next();
  }
}
