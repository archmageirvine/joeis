package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056352 Number of primitive (period n) bracelets using exactly six different colored beads.
 * @author Sean A. Irvine
 */
public class A056352 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056352() {
    super(new A056346(), 0);
    next();
  }
}
