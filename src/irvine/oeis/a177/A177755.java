package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177755 Number of ways to place 2 nonattacking bishops on <code>an n</code> X n toroidal board.
 * @author Sean A. Irvine
 */
public class A177755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177755() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 4, 18, 80, 200, 468, 882, 1600});
  }
}
