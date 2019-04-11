package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172078 <code>a(n) = (16*n^3+3*n^2-13*n)/6</code>.
 * @author Sean A. Irvine
 */
public class A172078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172078() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 19, 70});
  }
}
