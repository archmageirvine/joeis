package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074553 <code>a(n) = 3^n + 5^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074553() {
    super(new long[] {120, -79, 16}, new long[] {3, 16, 98});
  }
}
