package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384605 Expansion of (1+x) / (1-x-4*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A384605 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384605() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}}, 2);
  }
}
