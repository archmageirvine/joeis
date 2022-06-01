package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109437 a(-1) = a(0) = 0, a(1) = 1; a(n) = 5a(n-1) - 5a(n-2) + a(n-3) + 2*(-1)^(n+1), alternatively a(n) = 3a(n-1) + 3a(n-2) - a(n-3).
 * @author Sean A. Irvine
 */
public class A109437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109437() {
    super(new long[] {-1, 3, 3}, new long[] {0, 1, 3});
  }
}
