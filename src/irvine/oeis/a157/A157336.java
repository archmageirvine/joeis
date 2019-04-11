package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157336 <code>a(n) = 8*(8*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A157336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157336() {
    super(new long[] {-1, 2}, new long[] {72, 136});
  }
}
