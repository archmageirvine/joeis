package irvine.oeis.a053;

import irvine.oeis.PositionSequence;

/**
 * A053234 Numbers n such that A053230(n) = 1.
 * @author Sean A. Irvine
 */
public class A053234 extends PositionSequence {

  /** Construct the sequence. */
  public A053234() {
    super(1, new A053230(), 1);
  }
}
