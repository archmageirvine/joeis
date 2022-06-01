package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236165 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = a(1) = 1, a(2) = 0.
 * @author Sean A. Irvine
 */
public class A236165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236165() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, 0, 0});
  }
}
