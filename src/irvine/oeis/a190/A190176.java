package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190176 a(n) = n^4 + 2^4 + (n+2)^4.
 * @author Sean A. Irvine
 */
public class A190176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190176() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {32, 98, 288, 722, 1568});
  }
}
