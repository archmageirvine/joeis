package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020538 <code>a(n) = 4th</code> Chebyshev polynomial (first kind) evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020538() {
    super(new long[] {64, -84, 21}, new long[] {1, 97, 1921});
  }
}
