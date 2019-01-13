package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272103.
 * @author Sean A. Irvine
 */
public class A272103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272103() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14, 85, 320, 910, 2156});
  }
}
