package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092493 <code>a(n) = 4a(n-1) - 4a(n-2) + 3a(n-3) + a(n-4) - a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A092493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092493() {
    super(new long[] {-1, 1, 3, -4, 4}, new long[] {1, 2, 5, 14, 42});
  }
}
