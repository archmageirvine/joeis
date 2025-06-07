package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384599 Expansion of (1+3*x+2*x^2) / (1-4*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A384599 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384599() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 0}, {0, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 0, 1, 1, 0}}, 2);
  }
}
