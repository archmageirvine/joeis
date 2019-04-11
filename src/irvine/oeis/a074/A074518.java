package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074518 <code>a(n) = 1^n + 5^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074518() {
    super(new long[] {40, -53, 14}, new long[] {3, 14, 90});
  }
}
