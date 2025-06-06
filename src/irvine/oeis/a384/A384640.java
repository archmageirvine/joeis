package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A382683.
 * @author Sean A. Irvine
 */
public class A384640 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384640() {
    super(new long[][] {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 1, 1, 1, 0}}, 0);
  }
}
