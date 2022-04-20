package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056387 Number of primitive (aperiodic) step shifted (decimated) sequences using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056387 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056387() {
    super(new A056377(), 0);
    next();
  }
}
