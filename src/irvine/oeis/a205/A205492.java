package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205492 Expansion of <code>(1-x^2-x^3-x^4+x^5)/((1-x)^3*(1-x-x^2)^2*(1-2*x-x^2+x^3))</code>.
 * @author Sean A. Irvine
 */
public class A205492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205492() {
    super(new long[] {1, -2, -5, 13, 3, -26, 15, 12, -17, 7}, new long[] {1, 7, 31, 109, 334, 937, 2475, 6267, 15393, 36976});
  }
}
