package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200676 Expansion of -(3*x^2-5*x+1)/(x^3-3*x^2+5*x-1).
 * @author Sean A. Irvine
 */
public class A200676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200676() {
    super(new long[] {1, -3, 5}, new long[] {1, 0, 0});
  }
}
