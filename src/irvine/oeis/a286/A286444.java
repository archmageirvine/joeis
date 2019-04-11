package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286444 Number of non-equivalent ways to tile <code>an n</code> X n X n triangular area with two 2 X 2 X 2 triangular tiles and <code>an</code> appropriate number <code>(= n^2-8)</code> of 1 X 1 X 1 tiles.
 * @author Sean A. Irvine
 */
public class A286444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286444() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 3, 10, 32, 70, 143, 252});
  }
}
