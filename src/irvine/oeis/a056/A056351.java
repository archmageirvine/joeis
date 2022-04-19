package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056351 Number of primitive (period n) bracelets using exactly five different colored beads.
 * @author Sean A. Irvine
 */
public class A056351 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056351() {
    super(new A056345(), 0);
    next();
  }
}
