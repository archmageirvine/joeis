package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023002 Sum of 10th powers.
 * @author Sean A. Irvine
 */
public class A023002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023002() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 1, 1025, 60074, 1108650, 10874275, 71340451, 353815700, 1427557524, 4914341925L, 14914341925L, 40851766526L});
  }
}
