package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056439 Number of primitive (period n) step cyclic shifted sequence structures using a maximum of two different symbols.
 * @author Sean A. Irvine
 */
public class A056439 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056439() {
    super(new A056429(), 0);
    next();
  }
}
