package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241685 The total number of squares and rectangles appearing in the Thue-Morse sequence logical matrices after n stages.
 * @author Sean A. Irvine
 */
public class A241685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241685() {
    super(new long[] {16, -4, -20, 5, 4}, new long[] {0, 2, 4, 18, 60});
  }
}
