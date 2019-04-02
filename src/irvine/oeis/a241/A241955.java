package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241955 a(n) = 2^(4*n+3) - 1.
 * @author Sean A. Irvine
 */
public class A241955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241955() {
    super(new long[] {-16, 17}, new long[] {7, 127});
  }
}
