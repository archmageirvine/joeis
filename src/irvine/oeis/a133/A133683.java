package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133683 Linear recurrence <code>a(n) = a(n-3) + 2a(n-5),</code> starting from all-one initial conditions.
 * @author Sean A. Irvine
 */
public class A133683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133683() {
    super(new long[] {2, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
