package irvine.oeis.a002;

import irvine.oeis.AbsoluteSequence;
import irvine.oeis.a225.A225923;

/**
 * A002292 Related to representation as sums of squares.
 * @author Sean A. Irvine
 */
public class A002292 extends AbsoluteSequence {

  /** Construct the sequence. */
  public A002292() {
    super(new A225923());
  }
}
