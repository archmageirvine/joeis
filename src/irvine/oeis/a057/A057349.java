package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057349 Leap years in the Hebrew Calendar starting in year <code>1 (3761</code> BCE). The leap year has an extra-month.
 * @author Sean A. Irvine
 */
public class A057349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057349() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {3, 6, 8, 11, 14, 17, 19, 22});
  }
}
