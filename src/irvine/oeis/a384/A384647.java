package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384647 Expansion of (1+3*x+x^2) / (1-x-5*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A384647 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384647() {
    super(new long[][] {{0, 1, 0, 0, 1}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}}, 1);
  }
}
