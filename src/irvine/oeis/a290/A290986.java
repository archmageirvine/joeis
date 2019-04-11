package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290986 Expansion of <code>x^6/((1 - x)^2*(1 - 2*x + x^3 - x^4))</code>.
 * @author Sean A. Irvine
 */
public class A290986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290986() {
    super(new long[] {1, -3, 3, 1, -5, 4}, new long[] {1, 4, 11, 25, 52, 103});
  }
}
