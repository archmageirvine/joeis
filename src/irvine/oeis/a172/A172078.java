package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172078 <code>a(n) = n*(16*n^2 + 3*n - 13)/6</code>.
 * @author Sean A. Irvine
 */
public class A172078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172078() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 19, 70});
  }
}
