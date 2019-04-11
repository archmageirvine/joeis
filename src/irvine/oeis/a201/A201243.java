package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201243 Number of ways to place 2 non-attacking ferses on <code>an n</code> X n board.
 * @author Sean A. Irvine
 */
public class A201243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201243() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 28, 102, 268});
  }
}
