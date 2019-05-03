package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184551 <code>Super-birthdays (falling</code> on the same <code>weekday)</code>, version <code>3 (birth</code> within 2 and 3 years after a February <code>29)</code>.
 * @author Sean A. Irvine
 */
public class A184551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184551() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 11, 17, 22, 28});
  }
}
