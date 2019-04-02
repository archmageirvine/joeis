package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162147 a(n) = n*(n+1)*(5*n+4)/6.
 * @author Sean A. Irvine
 */
public class A162147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162147() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 14, 38});
  }
}
