package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174723 a(n) = n*(4*n^2 - 3*n + 5)/6.
 * @author Sean A. Irvine
 */
public class A174723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174723() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 16, 38});
  }
}
