package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056446 Number of primitive (period n) step cyclic shifted sequence structures using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056446 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056446() {
    super(new A056436(), 0);
    next();
  }
}
