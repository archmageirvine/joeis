package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056441 Number of primitive (period n) step cyclic shifted sequence structures using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056441 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056441() {
    super(new A056431(), 0);
    next();
  }
}
