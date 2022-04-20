package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056388 Number of primitive (aperiodic) step shifted (decimated) sequences using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056388 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056388() {
    super(new A056378(), 0);
    next();
  }
}
