package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272130.
 * @author Sean A. Irvine
 */
public class A272130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272130() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 31, 177, 535});
  }
}
