package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056402 Number of primitive (aperiodic) step shifted (decimated) sequence structures using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056402 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056402() {
    super(new A056392(), 0);
    next();
  }
}
