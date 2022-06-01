package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074543 a(n) = 2^n + 6^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074543() {
    super(new long[] {108, -84, 17}, new long[] {3, 17, 121});
  }
}
