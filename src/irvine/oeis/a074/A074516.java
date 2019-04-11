package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074516 <code>a(n) = 1^n + 5^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074516() {
    super(new long[] {30, -41, 12}, new long[] {3, 12, 62});
  }
}
