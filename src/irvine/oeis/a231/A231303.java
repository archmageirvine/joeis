package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231303 Recurrence a(n) = a(n-2) + n^M for M=4, starting with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A231303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231303() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 16, 82, 272, 707});
  }
}
