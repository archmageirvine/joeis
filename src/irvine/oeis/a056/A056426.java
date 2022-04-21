package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056426 Number of primitive (period n) step cyclic shifted sequences using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056426 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056426() {
    super(new A056417(), 0);
    next();
  }
}
