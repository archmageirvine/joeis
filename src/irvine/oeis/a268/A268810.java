package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268810 a(n) = 2*floor(3*n*(n+1)/4).
 * @author Sean A. Irvine
 */
public class A268810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268810() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 2, 8, 18, 30});
  }
}
