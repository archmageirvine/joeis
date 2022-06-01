package irvine.oeis.a002;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A002537 a(2n) = a(2n-1) + 3a(2n-2), a(2n+1) = 2a(2n) + 3a(2n-1).
 * @author Sean A. Irvine
 */
public class A002537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002537() {
    super(new long[] {-9, 0, 8, 0}, new long[] {1, 1, 4, 11});
  }
}
