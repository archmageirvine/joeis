package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020539 a(n) = 5th Chebyshev polynomial (first kind) evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020539() {
    super(new long[] {512, -336, 42}, new long[] {1, 362, 15124});
  }
}
