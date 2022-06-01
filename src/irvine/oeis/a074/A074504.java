package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074504 a(n) = 1^n + 2^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074504() {
    super(new long[] {16, -26, 11}, new long[] {3, 11, 69});
  }
}
