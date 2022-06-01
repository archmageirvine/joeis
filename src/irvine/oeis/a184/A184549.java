package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184549 Super-birthdays (falling on the same weekday), version 1 (birth within the year following a February 29).
 * @author Sean A. Irvine
 */
public class A184549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184549() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 6, 17, 23, 28});
  }
}
