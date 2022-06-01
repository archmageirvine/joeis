package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092202 Expansion of (x - x^3) / (1 - x^5) in powers of x.
 * @author Sean A. Irvine
 */
public class A092202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092202() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, 0, -1});
  }
}
