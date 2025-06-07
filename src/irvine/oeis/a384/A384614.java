package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384614 Expansion of (1+x+x^2) / (1-x-3*x^2).
 * @author Sean A. Irvine
 */
public class A384614 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384614() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {0, 0, 0, 1, 0}}, 2);
  }
}
