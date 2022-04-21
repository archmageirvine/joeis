package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056422 Number of primitive (period n) step cyclic shifted sequences using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056422 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056422() {
    super(new A056413(), 0);
    next();
  }
}
