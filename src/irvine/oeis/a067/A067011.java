package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067011 a(2n) and a(2n+1) are side lengths of a Beentjes sequence of perfect squared rectangles, starting with a 33 X 32 rectangle.
 * @author Sean A. Irvine
 */
public class A067011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067011() {
    super(new long[] {9, 0, 22, 0}, new long[] {33, 32, 683, 781});
  }
}
