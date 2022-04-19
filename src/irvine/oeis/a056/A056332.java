package irvine.oeis.a056;

import irvine.oeis.a001.A001998;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056332 Number of primitive (aperiodic) reversible string structures with n beads using a maximum of three different colors.
 * @author Sean A. Irvine
 */
public class A056332 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056332() {
    super(new A001998(), 0);
    next();
  }
}
