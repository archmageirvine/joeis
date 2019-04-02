package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092440 a(n) = 2^(2n+1) - 2^(n+1) + 1.
 * @author Sean A. Irvine
 */
public class A092440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092440() {
    super(new long[] {8, -14, 7}, new long[] {1, 5, 25});
  }
}
