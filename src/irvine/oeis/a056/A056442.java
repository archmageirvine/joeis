package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056442 Number of primitive (period n) step cyclic shifted sequence structures using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056442 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056442() {
    super(new A056432(), 0);
    next();
  }
}
