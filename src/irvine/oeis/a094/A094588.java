package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094588 <code>a(n) = n*F(n-1) + F(n),</code> where F = A000045.
 * @author Sean A. Irvine
 */
public class A094588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094588() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 3, 5});
  }
}
