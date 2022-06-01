package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214826 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = 1, a(1) = a(2) = 4.
 * @author Sean A. Irvine
 */
public class A214826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214826() {
    super(new long[] {1, 1, 1}, new long[] {1, 4, 4});
  }
}
