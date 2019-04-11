package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142954 <code>a(n) = 2*n+3+3*(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A142954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142954() {
    super(new long[] {-1, 1, 1}, new long[] {2, 10, 6});
  }
}
