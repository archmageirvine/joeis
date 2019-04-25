package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289225 Number of ways to select 4 disjoint point triples from an n X n X n triangular point grid, each point triple forming <code>a 2</code> X 2 X 2 triangle.
 * @author Sean A. Irvine
 */
public class A289225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289225() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 13, 859, 9585, 56520, 231635, 749223, 2051819, 4965960});
  }
}
