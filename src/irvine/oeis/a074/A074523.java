package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074523 <code>a(n) = 1^n + 7^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074523() {
    super(new long[] {56, -71, 16}, new long[] {3, 16, 114});
  }
}
