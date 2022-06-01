package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162668 a(n) = n*(n+1)*(n+2)*(n+3)/3.
 * @author Sean A. Irvine
 */
public class A162668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162668() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 40, 120, 280});
  }
}
