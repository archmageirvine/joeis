package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081854.
 * @author Sean A. Irvine
 */
public class A081854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081854() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 60, 2093, 13398, 47415});
  }
}
