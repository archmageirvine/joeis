package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125904 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks at least one of the digits 1,2,3,4 and at least one of the digits 5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125904() {
    super(1, new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {10, 100, 1000, 9976, 98920, 971440, 9420400, 90005176});
  }
}
