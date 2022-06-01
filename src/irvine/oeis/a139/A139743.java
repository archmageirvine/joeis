package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139743 a(n) = 11^n - 5^n.
 * @author Sean A. Irvine
 */
public class A139743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139743() {
    super(new long[] {-55, 16}, new long[] {0, 6});
  }
}
