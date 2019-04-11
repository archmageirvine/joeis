package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200739 Expansion of <code>(-x^2+5*x-1)/(x^3-x^2+5*x-1)</code>.
 * @author Sean A. Irvine
 */
public class A200739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200739() {
    super(new long[] {1, -1, 5}, new long[] {1, 0, 0});
  }
}
