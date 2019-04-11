package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272299 <code>a(n) = n + 2*floor(n/2) + 3*floor(n/3)</code>.
 * @author Sean A. Irvine
 */
public class A272299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272299() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 4, 8, 11});
  }
}
