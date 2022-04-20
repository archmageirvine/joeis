package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056386 Number of primitive (aperiodic) step shifted (decimated) sequences using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056386 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056386() {
    super(new A056376(), 0);
    next();
  }
}
