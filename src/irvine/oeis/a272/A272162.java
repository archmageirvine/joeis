package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272162 a(n) = n^5-n+1.
 * @author Sean A. Irvine
 */
public class A272162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272162() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 1, 31, 241, 1021, 3121});
  }
}
