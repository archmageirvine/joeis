package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231304 Recurrence a(n) = a(n-2) + n^M for M=5, starting with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A231304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231304() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {0, 1, 32, 244, 1056, 3369, 8832, 20176});
  }
}
