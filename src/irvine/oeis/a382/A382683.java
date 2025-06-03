package irvine.oeis.a382;

import irvine.oeis.GraphWalkSequence;

/**
 * A382683 Expansion of (1-x^2) / (1-x-3*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A382683 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A382683() {
    super(new long[][] {{0, 1, 0, 0}, {1, 0, 1, 1}, {0, 1, 0, 1}, {0, 1, 1, 0}}, 0);
  }
}
