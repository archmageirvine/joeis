package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028814 Expansion of (1-2*x)/((1-x)^3*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A028814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028814() {
    super(new long[] {-4, 13, -15, 7}, new long[] {1, 5, 20, 78});
  }
}
