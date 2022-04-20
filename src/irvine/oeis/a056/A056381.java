package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056381 Number of primitive (aperiodic) step shifted (decimated) sequences using a maximum of two different symbols.
 * @author Sean A. Irvine
 */
public class A056381 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056381() {
    super(new A056371(), 0);
    next();
  }
}
