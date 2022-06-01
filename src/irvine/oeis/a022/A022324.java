package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022324 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 1 and a(1) = 10.
 * @author Sean A. Irvine
 */
public class A022324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022324() {
    super(new long[] {-1, 0, 2}, new long[] {1, 10, 12});
  }
}
