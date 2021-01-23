package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136313 a(1) = 1; for n&gt;1, a(n) = a(n-1) + 8 mod 22.
 * @author Sean A. Irvine
 */
public class A136313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136313() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 9, 17, 3, 11, 19, 5, 13, 21, 7, 15});
  }
}
