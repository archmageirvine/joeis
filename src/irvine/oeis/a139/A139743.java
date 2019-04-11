package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139743 <code>a(n) = 11^n - 5^n</code>.
 * @author Sean A. Irvine
 */
public class A139743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139743() {
    super(new long[] {-55, 16}, new long[] {0, 6});
  }
}
