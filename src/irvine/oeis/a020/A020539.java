package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020539 <code>a(n) = 5th</code> Chebyshev polynomial (first kind) evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020539() {
    super(new long[] {512, -336, 42}, new long[] {1, 362, 15124});
  }
}
