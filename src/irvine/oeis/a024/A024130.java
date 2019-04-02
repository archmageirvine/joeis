package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024130 a(n) = 11^n - n^3.
 * @author Sean A. Irvine
 */
public class A024130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024130() {
    super(new long[] {11, -45, 70, -50, 15}, new long[] {1, 10, 113, 1304, 14577});
  }
}
