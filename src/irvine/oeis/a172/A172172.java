package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172172.
 * @author Sean A. Irvine
 */
public class A172172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172172() {
    super(new long[] {-1, 0, 2}, new long[] {0, 1, 10});
  }
}
