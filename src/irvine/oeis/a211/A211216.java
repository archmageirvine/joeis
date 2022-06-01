package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211216 Expansion of (1-8*x+21*x^2-20*x^3+5*x^4)/(1-9*x+28*x^2-35*x^3+15*x^4-x^5).
 * @author Sean A. Irvine
 */
public class A211216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211216() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 1, 2, 5, 14});
  }
}
