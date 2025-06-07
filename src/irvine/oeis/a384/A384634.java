package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384634 Expansion of (1+2*x+x^2) / (1-6*x^2-4*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A384634 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384634() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {0, 1, 0, 1, 0}}, 2);
  }
}
