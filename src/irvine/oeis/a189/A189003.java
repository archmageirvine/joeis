package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189003 Number of domino tilings of the <code>5 X n</code> grid with upper left corner removed iff n is odd.
 * @author Sean A. Irvine
 */
public class A189003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189003() {
    super(new long[] {-1, 0, 15, 0, -32, 0, 15, 0}, new long[] {1, 1, 8, 15, 95, 192, 1183, 2415});
  }
}
