package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289864 Number of cliques in the n-triangular honeycomb queen graph.
 * @author Sean A. Irvine
 */
public class A289864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289864() {
    super(new long[] {2, -7, 7, 2, -8, 5}, new long[] {2, 8, 27, 72, 169, 367});
  }
}
