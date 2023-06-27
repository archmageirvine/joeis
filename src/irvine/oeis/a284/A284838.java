package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284838 Number of edges in the n-Keller graph.
 * @author Sean A. Irvine
 */
public class A284838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284838() {
    super(1, new long[] {-3072, 1984, -432, 36}, new long[] {0, 40, 1088, 21888});
  }
}
