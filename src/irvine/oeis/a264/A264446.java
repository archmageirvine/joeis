package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264446 a(n) = n*(n + 5)*(n + 10)*(n + 15)/24.
 * @author Sean A. Irvine
 */
public class A264446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264446() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 44, 119, 234, 399});
  }
}
