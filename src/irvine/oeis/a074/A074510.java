package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074510 <code>a(n) = 1^n + 3^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074510() {
    super(new long[] {24, -35, 12}, new long[] {3, 12, 74});
  }
}
