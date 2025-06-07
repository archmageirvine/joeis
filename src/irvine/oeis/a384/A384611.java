package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384611 Expansion of (1+2*x-x^3) / (1-5*x^2+2*x^4).
 * @author Sean A. Irvine
 */
public class A384611 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384611() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {0, 0, 1, 0, 1}, {0, 1, 0, 1, 0}}, 2);
  }
}
