package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020542 <code>a(n) =</code> 5th Chebyshev polynomial (second kind) evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020542() {
    super(new long[] {512, -336, 42}, new long[] {6, 780, 30744});
  }
}
