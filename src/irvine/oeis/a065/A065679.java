package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065679 If n is even, <code>a(n) = n^2</code> else <code>a(n) =</code> n.
 * @author Sean A. Irvine
 */
public class A065679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065679() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 4, 3, 16, 5});
  }
}
