package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034827 a(n) = 2*binomial(n,4).
 * @author Sean A. Irvine
 */
public class A034827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034827() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 2});
  }
}
