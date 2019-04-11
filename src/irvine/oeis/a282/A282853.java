package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282853 36-gonal numbers: <code>a(n) = n*(17*n-16)</code>.
 * @author Sean A. Irvine
 */
public class A282853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282853() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 36});
  }
}
