package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196875 a(n) = a(n-4) + a(n-3) + a(n-2) + a(n-1) + (n-5).
 * @author Sean A. Irvine
 */
public class A196875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196875() {
    super(new long[] {1, -1, 0, 0, -2, 3}, new long[] {1, 1, 1, 1, 4, 8});
  }
}
