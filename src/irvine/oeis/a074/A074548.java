package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074548 a(n) = 3^n + 4^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074548() {
    super(new long[] {72, -54, 13}, new long[] {3, 13, 61});
  }
}
