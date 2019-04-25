package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052149 Nonsquare rectangles on an n X n board.
 * @author Sean A. Irvine
 */
public class A052149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052149() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 22, 70, 170});
  }
}
