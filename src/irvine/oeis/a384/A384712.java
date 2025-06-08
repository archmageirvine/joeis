package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384677.
 * @author Sean A. Irvine
 */
public class A384712 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384712() {
    super(new long[][] {{0, 1, 0, 1, 1}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 0}}, 1);
  }
}
