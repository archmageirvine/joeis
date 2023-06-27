package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085046 a(n) = n^2 - (1 + (-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A085046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085046() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {1, 3, 9, 15});
  }
}
