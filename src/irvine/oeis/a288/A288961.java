package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288961 Number of 3-cycles in the n X n rook graph.
 * @author Sean A. Irvine
 */
public class A288961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288961() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 6, 32, 100});
  }
}
