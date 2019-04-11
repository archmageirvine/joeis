package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254006 <code>a(0) = 1, a(n) = 3*a(n-2)</code> if <code>n mod 2 = 0,</code> otherwise <code>a(n) = 0</code>.
 * @author Sean A. Irvine
 */
public class A254006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254006() {
    super(new long[] {3, 0}, new long[] {1, 0});
  }
}
