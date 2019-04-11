package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137787 <code>a(n) = 5^n - 4^n - 3^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A137787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137787() {
    super(new long[] {-120, 154, -71, 14}, new long[] {-2, -4, -4, 26});
  }
}
