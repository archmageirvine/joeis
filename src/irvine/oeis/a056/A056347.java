package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056347 Number of primitive (period n) bracelets using a maximum of six different colored beads.
 * @author Sean A. Irvine
 */
public class A056347 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056347() {
    super(new A056341(), 0);
    next();
  }
}
