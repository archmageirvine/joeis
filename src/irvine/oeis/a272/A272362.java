package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272362.
 * @author Sean A. Irvine
 */
public class A272362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272362() {
    super(new long[] {-1, -1, 0, 1, 2}, new long[] {1, 3, 6, 14, 32});
  }
}
