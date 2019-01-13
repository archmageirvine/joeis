package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272975.
 * @author Sean A. Irvine
 */
public class A272975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272975() {
    super(new long[] {-1, 1, 1}, new long[] {0, 7, 12});
  }
}
