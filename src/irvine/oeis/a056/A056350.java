package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056350 Number of primitive (period n) bracelets using exactly four different colored beads.
 * @author Sean A. Irvine
 */
public class A056350 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056350() {
    super(new A056344(), 0);
    next();
  }
}
