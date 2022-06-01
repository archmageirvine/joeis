package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254006 a(0) = 1, a(n) = 3*a(n-2) if n mod 2 = 0, otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A254006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254006() {
    super(new long[] {3, 0}, new long[] {1, 0});
  }
}
