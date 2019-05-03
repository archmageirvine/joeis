package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065530 If n is odd then <code>a(n) =</code> n, else <code>a(n) = n*(n+2)</code>.
 * @author Sean A. Irvine
 */
public class A065530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065530() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 8, 3, 24, 5});
  }
}
