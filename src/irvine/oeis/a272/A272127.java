package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272127 a(n) = 1680*n^4 - 168*n^2 + 128*n + 1.
 * @author Sean A. Irvine
 */
public class A272127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272127() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1641, 26465, 134953, 427905});
  }
}
