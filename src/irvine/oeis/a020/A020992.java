package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020992 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = 0, a(1) = 2, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A020992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020992() {
    super(new long[] {1, 1, 1}, new long[] {0, 2, 1});
  }
}
