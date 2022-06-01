package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094256 Expansion of x / ( (x-1)*(x^3 - 9*x^2 + 6*x - 1) ).
 * @author Sean A. Irvine
 */
public class A094256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094256() {
    super(new long[] {-1, 10, -15, 7}, new long[] {1, 7, 34, 143});
  }
}
