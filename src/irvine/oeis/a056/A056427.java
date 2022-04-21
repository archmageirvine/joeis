package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056427 Number of primitive (period n) step cyclic shifted sequences using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056427 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056427() {
    super(new A056418(), 0);
    next();
  }
}
