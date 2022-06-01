package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074569 a(n) = 4^n + 7^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074569() {
    super(new long[] {252, -127, 20}, new long[] {3, 20, 146});
  }
}
