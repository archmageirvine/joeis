package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272127.
 * @author Sean A. Irvine
 */
public class A272127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272127() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1641, 26465, 134953, 427905});
  }
}
