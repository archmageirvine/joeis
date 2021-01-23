package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272379 a(n) = n*(24*n^3 - 60*n^2 + 54*n - 17).
 * @author Sean A. Irvine
 */
public class A272379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272379() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 86, 759, 3100});
  }
}
