package irvine.oeis.a002;

import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.a000.A000108;

/**
 * A002996.
 * @author Sean A. Irvine
 */
public class A002996 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A002996() {
    super(new A000108(), 1);
    next();
  }
}
