package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074540 <code>a(n) = 2^n + 5^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074540() {
    super(new long[] {90, -73, 16}, new long[] {3, 16, 110});
  }
}
