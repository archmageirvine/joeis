package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074574 a(n) = 5^n + 7^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074574() {
    super(new long[] {280, -131, 20}, new long[] {3, 20, 138});
  }
}
