package irvine.oeis.a053;

import irvine.oeis.PositionSequence;

/**
 * A053236 Numbers n such that A053230(n) = 4.
 * @author Sean A. Irvine
 */
public class A053236 extends PositionSequence {

  /** Construct the sequence. */
  public A053236() {
    super(1, new A053230(), 4);
  }
}
