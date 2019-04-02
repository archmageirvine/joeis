package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108195 a(n) = n^2 + 5*n - 1.
 * @author Sean A. Irvine
 */
public class A108195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108195() {
    super(new long[] {1, -3, 3}, new long[] {5, 13, 23});
  }
}
