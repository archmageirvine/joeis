package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241894 The total number of squares and rectangles appearing in the Thue-Morse sequence (1, 0 version) logical matrices after n stages.
 * @author Sean A. Irvine
 */
public class A241894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241894() {
    super(new long[] {16, -4, -20, 5, 4}, new long[] {1, 2, 5, 18, 61});
  }
}
