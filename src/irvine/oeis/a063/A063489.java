package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063489 a(n) = (2*n-1)*(5*n^2-5*n+6)/6.
 * @author Sean A. Irvine
 */
public class A063489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063489() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 8, 30, 77});
  }
}
