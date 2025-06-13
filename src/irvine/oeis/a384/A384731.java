package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384731 Expansion of (1+2*x-x^2) / (1-x-6*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A384731 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384731() {
    super(new long[][] {{0, 1, 0, 0, 1}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 1}, {0, 1, 1, 0, 1}, {1, 0, 1, 1, 0}}, 1);
  }
}
