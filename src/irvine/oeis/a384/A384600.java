package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384600 Expansion of (1+x-x^2) / (1-x-4*x^2+2*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A384600 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384600() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 0}, {0, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 0, 1, 1, 0}}, 3);
  }
}
