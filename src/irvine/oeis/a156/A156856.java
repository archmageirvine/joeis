package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156856 a(n) = 2025*n^2 + n.
 * @author Sean A. Irvine
 */
public class A156856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156856() {
    super(1, new long[] {1, -3, 3}, new long[] {2026, 8102, 18228});
  }
}
