package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056420 Number of primitive (period n) step cyclic shifted sequences using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056420 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056420() {
    super(new A056411(), 0);
    next();
  }
}
