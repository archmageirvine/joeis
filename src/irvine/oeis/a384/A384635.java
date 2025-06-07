package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384635 Expansion of (1+3*x+2*x^2) / (1-6*x^2-4*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A384635 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384635() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {0, 1, 0, 1, 0}}, 3);
  }
}
