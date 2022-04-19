package irvine.oeis.a056;

import irvine.oeis.a005.A005418;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056331 Number of primitive (aperiodic) reversible string structures with n beads using a maximum of two different colors.
 * @author Sean A. Irvine
 */
public class A056331 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056331() {
    super(new A005418(), 0);
    next();
  }
}
