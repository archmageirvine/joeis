package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056425 Number of primitive (period n) step cyclic shifted sequences using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056425 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056425() {
    super(new A056416(), 0);
    next();
  }
}
