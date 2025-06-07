package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384598 Expansion of (1-3*x^2) / (1-x-4*x^2+2*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A384598 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384598() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 0}, {0, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 0, 1, 1, 0}}, 0);
  }
}
