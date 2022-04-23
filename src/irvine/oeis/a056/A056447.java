package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056447 Number of primitive (period n) step cyclic shifted sequence structures using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056447 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056447() {
    super(new A056437(), 0);
    next();
  }
}
