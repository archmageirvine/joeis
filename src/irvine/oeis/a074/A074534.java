package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074534 a(n) = 2^n + 4^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074534() {
    super(new long[] {56, -50, 13}, new long[] {3, 13, 69});
  }
}
