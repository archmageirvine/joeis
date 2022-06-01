package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272871 Imaginary part of (n + i)^4.
 * @author Sean A. Irvine
 */
public class A272871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272871() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 24, 96});
  }
}
