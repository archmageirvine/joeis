package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272125 a(n) = n^3*(2*n^2+1)/3.
 * @author Sean A. Irvine
 */
public class A272125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272125() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 24, 171, 704, 2125});
  }
}
