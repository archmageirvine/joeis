package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086955 a(n) = n^2 + 2*n + 2 - (-1)^n.
 * @author Sean A. Irvine
 */
public class A086955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086955() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 6, 9, 18});
  }
}
