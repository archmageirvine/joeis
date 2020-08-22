package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236771 a(n) = n + floor(n/2 + n^2/3).
 * @author Sean A. Irvine
 */
public class A236771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236771() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 1, 4, 7, 11, 15});
  }
}
