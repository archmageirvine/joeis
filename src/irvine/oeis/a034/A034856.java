package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034856 a(n) = binomial(n+1, 2) + n - 1 = n(n + 3)/2 - 1.
 * @author Sean A. Irvine
 */
public class A034856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034856() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 8});
  }
}
