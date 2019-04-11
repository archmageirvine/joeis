package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261443 Number of binary strings of length <code>n+5</code> such that the smallest number whose binary representation is not visible in the string is 7.
 * @author Sean A. Irvine
 */
public class A261443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261443() {
    super(new long[] {-1, -2, -1, 3, 7, 3, -3, -10, -4, 2, 7, 3, -1, -3, -3, 4}, new long[] {0, 2, 9, 31, 79, 185, 408, 864, 1771, 3555, 7021, 13696, 26453, 50700, 96565, 182983});
  }
}
