package irvine.oeis.a384;

import irvine.oeis.GraphWalkSequence;

/**
 * A384677.
 * @author Sean A. Irvine
 */
public class A384711 extends GraphWalkSequence {

  /** Construct the sequence. */
  public A384711() {
    super(new long[][] {{0, 1, 0, 1, 1}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 0}}, 0);
  }
}
