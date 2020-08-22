package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261557 a(0) = a(1) = 0; for n&gt;1, a(n) = 2*n - a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A261557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261557() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 0, 4, 2});
  }
}
