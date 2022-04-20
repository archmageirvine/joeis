package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056383 Number of primitive (aperiodic) step shifted (decimated) sequences using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056383 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056383() {
    super(new A056373(), 0);
    next();
  }
}
