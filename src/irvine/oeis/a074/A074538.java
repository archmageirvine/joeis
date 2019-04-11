package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074538 <code>a(n) = 2^n + 5^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074538() {
    super(new long[] {70, -59, 14}, new long[] {3, 14, 78});
  }
}
