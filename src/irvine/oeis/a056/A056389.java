package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056389 Number of primitive (aperiodic) step shifted (decimated) sequences using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056389 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056389() {
    super(new A056379(), 0);
    next();
  }
}
