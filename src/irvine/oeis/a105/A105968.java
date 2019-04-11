package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105968 <code>a(n) = 4*a(n-1) - a(n-2) - 2*(-1)^n, a(0) = 1, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A105968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105968() {
    super(new long[] {-1, 3, 3}, new long[] {1, 4, 13});
  }
}
