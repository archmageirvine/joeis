package irvine.oeis.a084;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A084111 Numbers m such that A084110(m) = m.
 * @author Sean A. Irvine
 */
public class A084111 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A084111() {
    super(1, new A084110());
  }
}
