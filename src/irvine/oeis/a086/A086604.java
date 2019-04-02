package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086604 2^(n-3)n(9n^2-9n+4).
 * @author Sean A. Irvine
 */
public class A086604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086604() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 1, 22, 174});
  }
}
