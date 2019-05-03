package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184550 <code>Super-birthdays (falling</code> on the same <code>weekday)</code>, version <code>2 (birth</code> within 1 and 2 years after a February <code>29)</code>.
 * @author Sean A. Irvine
 */
public class A184550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184550() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 6, 11, 17, 28});
  }
}
