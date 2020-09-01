package irvine.oeis.a034;

import irvine.oeis.PositionSequence;

/**
 * A034782 Numbers n such that A034693(n) = 3: 3n + 1 is prime, but neither n + 1 nor 2n + 1.
 * @author Sean A. Irvine
 */
public class A034782 extends PositionSequence {

  /** Construct the sequence. */
  public A034782() {
    super(1, new A034693(), 3);
  }
}
