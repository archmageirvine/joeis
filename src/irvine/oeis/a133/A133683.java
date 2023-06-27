package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133683 Linear recurrence a(n) = a(n-3) + 2a(n-5), starting from all-one initial conditions.
 * @author Sean A. Irvine
 */
public class A133683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133683() {
    super(1, new long[] {2, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
