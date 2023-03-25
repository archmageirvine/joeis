package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084624 a(n) = floor(C(n+5,5)/C(n+2,2)).
 * @author Sean A. Irvine
 */
public class A084624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084624() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {1, 2, 3, 5, 8, 12, 16, 22, 28, 36, 45, 56, 68, 81, 96, 114, 133, 154, 177, 202, 230, 260, 292});
  }
}
