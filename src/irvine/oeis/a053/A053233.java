package irvine.oeis.a053;

import irvine.oeis.PositionSequence;

/**
 * A053233 Numbers n such that A053230(n) = 2.
 * @author Sean A. Irvine
 */
public class A053233 extends PositionSequence {

  /** Construct the sequence. */
  public A053233() {
    super(1, new A053230(), 2);
  }
}
