package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272380.
 * @author Sean A. Irvine
 */
public class A272380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272380() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 342, 6315, 40492, 157125});
  }
}
