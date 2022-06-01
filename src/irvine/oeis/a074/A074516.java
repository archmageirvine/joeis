package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074516 a(n) = 1^n + 5^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074516() {
    super(new long[] {30, -41, 12}, new long[] {3, 12, 62});
  }
}
