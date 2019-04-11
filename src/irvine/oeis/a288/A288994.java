package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288994 <code>a(n) = n*(n+3)</code> when n is congruent to 0 or <code>3 (mod 4),</code> and <code>n*(n+3)/2</code> otherwise.
 * @author Sean A. Irvine
 */
public class A288994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288994() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 2, 5, 18, 28, 20, 27, 70, 88});
  }
}
