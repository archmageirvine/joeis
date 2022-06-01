package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200739 Expansion of (-x^2+5*x-1)/(x^3-x^2+5*x-1).
 * @author Sean A. Irvine
 */
public class A200739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200739() {
    super(new long[] {1, -1, 5}, new long[] {1, 0, 0});
  }
}
