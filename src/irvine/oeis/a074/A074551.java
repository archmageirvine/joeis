package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074551 a(n) = 3^n + 4^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074551() {
    super(new long[] {108, -75, 16}, new long[] {3, 16, 106});
  }
}
