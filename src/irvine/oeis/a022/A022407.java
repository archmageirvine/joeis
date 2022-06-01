package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022407 a(n) = a(n-1) + a(n-2) + 1, with a(0)=3, a(1)=8.
 * @author Sean A. Irvine
 */
public class A022407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022407() {
    super(new long[] {-1, 0, 2}, new long[] {3, 8, 12});
  }
}
