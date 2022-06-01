package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022565 Expansion of 1/((1-x)*(1-5*x)*(1-8*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A022565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022565() {
    super(new long[] {-400, 570, -193, 24}, new long[] {1, 24, 383, 5130});
  }
}
