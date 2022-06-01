package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074510 a(n) = 1^n + 3^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074510() {
    super(new long[] {24, -35, 12}, new long[] {3, 12, 74});
  }
}
