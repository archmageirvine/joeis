package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056445 Number of primitive (period n) step cyclic shifted sequence structures using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056445 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056445() {
    super(new A056435(), 0);
    next();
  }
}
