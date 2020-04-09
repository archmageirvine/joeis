package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036605 <code>a(n) = a(n-2) + 2*a(n-3) + a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A036605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036605() {
    super(new long[] {1, 2, 1, 0}, new long[] {1, 4, 4, 7});
  }
}
