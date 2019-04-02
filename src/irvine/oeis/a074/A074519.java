package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074519 a(n) = 1^n + 5^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074519() {
    super(new long[] {45, -59, 15}, new long[] {3, 15, 107});
  }
}
