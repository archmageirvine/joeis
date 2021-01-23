package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020542 a(n) = 5th Chebyshev polynomial (second kind) evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020542() {
    super(new long[] {512, -336, 42}, new long[] {6, 780, 30744});
  }
}
