package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196508 <code>a(n) = 2^n*(n^2 - n + 4)-4</code>.
 * @author Sean A. Irvine
 */
public class A196508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196508() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 4, 20, 76});
  }
}
