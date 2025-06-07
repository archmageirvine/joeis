package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384633 Expansion of (1+x-2*x^2-2*x^3) / (1-6*x^2-4*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A384633 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384633() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {0, 1, 0, 1, 0}}, 0);
  }
}
