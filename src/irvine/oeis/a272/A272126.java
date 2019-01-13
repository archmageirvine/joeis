package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272126.
 * @author Sean A. Irvine
 */
public class A272126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272126() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 183, 1205, 3787});
  }
}
