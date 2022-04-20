package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056401 Number of primitive (aperiodic) step shifted (decimated) sequence structures using a maximum of two different symbols.
 * @author Sean A. Irvine
 */
public class A056401 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056401() {
    super(new A056391(), 0);
    next();
  }
}
