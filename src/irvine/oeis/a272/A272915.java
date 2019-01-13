package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272915.
 * @author Sean A. Irvine
 */
public class A272915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272915() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 7, 9, 11});
  }
}
