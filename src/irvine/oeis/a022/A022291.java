package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022291 Expansion of 1/((1-x)*(1-5*x)*(1-6*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A022291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022291() {
    super(new long[] {-270, 399, -149, 21}, new long[] {1, 21, 292, 3402});
  }
}
