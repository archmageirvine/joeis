package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056421 Number of primitive (period n) step cyclic shifted sequences using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056421 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056421() {
    super(new A056412(), 0);
    next();
  }
}
