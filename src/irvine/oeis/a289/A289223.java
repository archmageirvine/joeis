package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289223 Number of ways to select 2 disjoint point triples from an n X n X n triangular point grid, each point triple forming an 2 X 2 X 2 triangle.
 * @author Sean A. Irvine
 */
public class A289223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289223() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 12, 66, 204});
  }
}
