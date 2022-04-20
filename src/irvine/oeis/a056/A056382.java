package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056382 Number of primitive (aperiodic) step shifted (decimated) sequences using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056382 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056382() {
    super(new A056372(), 0);
    next();
  }
}
