package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092521 a(n) = 8*a(n-1) - 8*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A092521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092521() {
    super(1, new long[] {1, -8, 8}, new long[] {1, 8, 56});
  }
}
