package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238188 <code>a(n) = 4*a(n-4) + 6*a(n-8) + 4*a(n-12) + a(n-16)</code> for <code>n&gt;15,</code> with the sixteen initial values as shown.
 * @author Sean A. Irvine
 */
public class A238188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238188() {
    super(new long[] {1, 0, 0, 0, 4, 0, 0, 0, 6, 0, 0, 0, 4, 0, 0, 0}, new long[] {0, 0, 1, 1, 2, 2, 2, 3, 9, 11, 13, 15, 48, 57, 68, 81});
  }
}
