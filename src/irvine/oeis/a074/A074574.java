package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074574 <code>a(n) = 5^n + 7^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074574() {
    super(new long[] {280, -131, 20}, new long[] {3, 20, 138});
  }
}
