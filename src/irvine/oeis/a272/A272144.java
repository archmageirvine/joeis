package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272144 Convolution of A000217 and A001045.
 * @author Sean A. Irvine
 */
public class A272144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272144() {
    super(new long[] {-2, 5, -2, -4, 4}, new long[] {0, 0, 1, 4, 12});
  }
}
