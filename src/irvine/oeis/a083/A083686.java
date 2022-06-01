package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083686 a(0) = 8; for n&gt;0, a(n) = 2*a(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A083686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083686() {
    super(new long[] {-2, 3}, new long[] {8, 15});
  }
}
