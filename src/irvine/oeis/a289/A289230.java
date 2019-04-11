package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289230 Number of nonequivalent ways to select 3 disjoint point triples from <code>an n</code> X n X n triangular point grid, each point triple forming <code>a 2</code> X 2 X 2 triangle.
 * @author Sean A. Irvine
 */
public class A289230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289230() {
    super(new long[] {1, -5, 9, -6, 0, 0, 0, 6, -9, 5}, new long[] {0, 2, 19, 127, 536, 1688, 4357, 9789, 19844, 37172});
  }
}
