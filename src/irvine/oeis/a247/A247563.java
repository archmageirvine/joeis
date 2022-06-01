package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247563 a(n) = 3*a(n-1) - 4*a(n-2) with a(0) = 2, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A247563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247563() {
    super(new long[] {-4, 3}, new long[] {2, 3});
  }
}
