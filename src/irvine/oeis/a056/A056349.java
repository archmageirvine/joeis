package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056349 Number of primitive (period n) bracelets using exactly three different colored beads.
 * @author Sean A. Irvine
 */
public class A056349 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056349() {
    super(new A056343(), 0);
    next();
  }
}
