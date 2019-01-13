package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272073.
 * @author Sean A. Irvine
 */
public class A272073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272073() {
    super(new long[] {-1, 0, 4, 0}, new long[] {3, 6, 15, 24});
  }
}
