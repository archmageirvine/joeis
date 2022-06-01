package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162540 a(n) = (2*n+1)*(2*n+3)*(2*n+5)/3.
 * @author Sean A. Irvine
 */
public class A162540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162540() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 35, 105, 231});
  }
}
