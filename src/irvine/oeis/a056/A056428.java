package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056428 Number of primitive (period n) step cyclic shifted sequences using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056428 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056428() {
    super(new A056419(), 0);
    next();
  }
}
