package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384641 Expansion of (1+2*x-x^3) / (1-x-5*x^2+x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A384641 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384641() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 1, 1, 1, 0}}, 2);
  }
}
