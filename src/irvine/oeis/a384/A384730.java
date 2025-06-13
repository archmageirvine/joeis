package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384730 Expansion of (1+x-2*x^2) / (1-x-6*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A384730 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384730() {
    super(new long[][] {{0, 1, 0, 0, 1}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 1}, {0, 1, 1, 0, 1}, {1, 0, 1, 1, 0}}, 0);
  }
}
