package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056443 Number of primitive (period n) step cyclic shifted sequence structures using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056443 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056443() {
    super(new A056433(), 0);
    next();
  }
}
