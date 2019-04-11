package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051263 Expansion of <code>1/((1-x)*(1-x^3)^2*(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A051263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051263() {
    super(new long[] {-1, 1, 0, 2, -2, 1, -2, 1, -2, 2, 0, 1}, new long[] {1, 1, 1, 3, 3, 4, 7, 7, 9, 13, 14, 17});
  }
}
