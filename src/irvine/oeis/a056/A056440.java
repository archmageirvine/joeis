package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056440 Number of primitive (period n) step cyclic shifted sequence structures using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056440 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056440() {
    super(new A056430(), 0);
    next();
  }
}
