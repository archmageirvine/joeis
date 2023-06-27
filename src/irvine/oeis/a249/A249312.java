package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249312 Expansion of x*(1+11*x-10*x^3)/(1-12*x^2+10*x^4).
 * @author Sean A. Irvine
 */
public class A249312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249312() {
    super(1, new long[] {-10, 0, 12, 0}, new long[] {1, 11, 12, 122});
  }
}
