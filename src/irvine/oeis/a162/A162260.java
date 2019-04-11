package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162260 <code>a(n) = (n^3 + 4*n^2 - n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162260() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 11, 30, 62});
  }
}
