package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384677 Expansion of (1-x-2*x^2) / (1-2*x-4*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A384677 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384677() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 1}, {0, 1, 1, 0, 1}, {0, 1, 1, 1, 0}}, 0);
  }
}
