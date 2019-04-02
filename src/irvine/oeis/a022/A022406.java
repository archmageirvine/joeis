package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022406 a(0)=3, a(1)=7; thereafter a(n) = a(n-1) + a(n-2) + 1.
 * @author Sean A. Irvine
 */
public class A022406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022406() {
    super(new long[] {-1, 0, 2}, new long[] {3, 7, 11});
  }
}
