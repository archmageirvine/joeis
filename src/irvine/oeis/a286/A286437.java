package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286437 Number of ways to tile <code>an n</code> X n X n triangular area with two 2 X 2 X 2 triangular tiles and an appropriate number <code>(= n^2-8)</code> of 1 X 1 X 1 tiles.
 * @author Sean A. Irvine
 */
public class A286437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286437() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 9, 48, 153, 372});
  }
}
