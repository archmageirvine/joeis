package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022323 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 1 and a(1) = 9.
 * @author Sean A. Irvine
 */
public class A022323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022323() {
    super(new long[] {-1, 0, 2}, new long[] {1, 9, 11});
  }
}
