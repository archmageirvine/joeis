package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078051 Expansion of (1-x)/(1+x+2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A078051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078051() {
    super(new long[] {-1, -2, -1}, new long[] {1, -2, 0});
  }
}
