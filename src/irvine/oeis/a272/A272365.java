package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272365.
 * @author Sean A. Irvine
 */
public class A272365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272365() {
    super(new long[] {1, -9, 9}, new long[] {10, 34, 250});
  }
}
