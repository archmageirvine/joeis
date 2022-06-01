package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074524 a(n) = 1^n + 7^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074524() {
    super(new long[] {63, -79, 17}, new long[] {3, 17, 131});
  }
}
