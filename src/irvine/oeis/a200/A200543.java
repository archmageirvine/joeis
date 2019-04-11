package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200543 Product of tribonacci numbers: <code>a(n) =</code> A000073(n+2)*A000213(n).
 * @author Sean A. Irvine
 */
public class A200543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200543() {
    super(new long[] {-1, 0, -1, 6, 3, 2}, new long[] {1, 1, 2, 12, 35, 117});
  }
}
