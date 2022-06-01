package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251701 a(n) = 3^n + n^2.
 * @author Sean A. Irvine
 */
public class A251701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251701() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 4, 13, 36});
  }
}
