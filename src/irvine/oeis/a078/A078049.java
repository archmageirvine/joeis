package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078049 Expansion of (1-x)/(1+x+2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A078049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078049() {
    super(new long[] {1, -2, -1}, new long[] {1, -2, 0});
  }
}
