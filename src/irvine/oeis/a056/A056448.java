package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056448 Number of primitive (period n) step cyclic shifted sequence structures using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056448 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056448() {
    super(new A056438(), 0);
    next();
  }
}
