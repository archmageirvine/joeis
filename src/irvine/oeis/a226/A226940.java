package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226940 a(0)=0; if a(n-1) is odd, a(n) = n + a(n-1), otherwise a(n) = n - a(n-1).
 * @author Sean A. Irvine
 */
public class A226940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226940() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 1, 3, 6, -2, 7, 13, 20, -12, 21, 31, 42});
  }
}
