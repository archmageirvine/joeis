package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184551 Super-birthdays (falling on the same weekday), version 3 (birth within 2 and 3 years after a February 29).
 * @author Sean A. Irvine
 */
public class A184551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184551() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 11, 17, 22, 28});
  }
}
