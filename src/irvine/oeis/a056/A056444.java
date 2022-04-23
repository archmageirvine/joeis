package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056444 Number of primitive (period n) step cyclic shifted sequence structures using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056444 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056444() {
    super(new A056434(), 0);
    next();
  }
}
