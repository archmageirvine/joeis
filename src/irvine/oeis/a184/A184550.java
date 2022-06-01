package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184550 Super-birthdays (falling on the same weekday), version 2 (birth within 1 and 2 years after a February 29).
 * @author Sean A. Irvine
 */
public class A184550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184550() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 6, 11, 17, 28});
  }
}
