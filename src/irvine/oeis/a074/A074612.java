package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074612 a(n) = 4^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074612() {
    super(new long[] {-24, 10}, new long[] {2, 10});
  }
}
