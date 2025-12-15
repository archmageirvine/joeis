package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037241 Expansion of (1+3*x^2+7*x^3+15*x^4+13*x^5+15*x^6+8*x^7+4*x^8)/((1-x)*(1-x^2)^3*(1-x^3)^2).
 * @author Sean A. Irvine
 */
public class A037241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037241() {
    super(new long[] {-1, 1, 3, -1, -5, -3, 6, 6, -3, -5, -1, 3, 1}, new long[] {1, 1, 7, 16, 46, 92, 197, 346, 616, 989, 1575, 2352, 3483});
  }
}
