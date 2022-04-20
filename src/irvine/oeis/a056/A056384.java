package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056384 Number of primitive (aperiodic) step shifted (decimated) sequences using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056384 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056384() {
    super(new A056374(), 0);
    next();
  }
}
