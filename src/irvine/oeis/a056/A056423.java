package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056423 Number of primitive (period n) step cyclic shifted sequences using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056423 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056423() {
    super(new A056414(), 0);
    next();
  }
}
