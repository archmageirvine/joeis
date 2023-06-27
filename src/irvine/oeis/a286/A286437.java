package irvine.oeis.a286;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A286437 Number of ways to tile an n X n X n triangular area with two 2 X 2 X 2 triangular tiles and an appropriate number (= n^2-8) of 1 X 1 X 1 tiles.
 * @author Sean A. Irvine
 */
public class A286437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286437() {
    super(3, new long[] {1, -5, 10, -10, 5}, new long[] {0, 9, 48, 153, 372});
  }
}
