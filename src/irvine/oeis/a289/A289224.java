package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289224 Number of ways to select 3 disjoint point triples from <code>an n</code> X n X n triangular point grid, each point triple forming <code>a 2</code> X 2 X 2 triangle.
 * @author Sean A. Irvine
 */
public class A289224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289224() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4, 82, 670, 3028, 9780, 25574});
  }
}
