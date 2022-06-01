package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164038 Expansion of (5-19*x)/(1-10*x+23*x^2).
 * @author Sean A. Irvine
 */
public class A164038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164038() {
    super(new long[] {-23, 10}, new long[] {5, 31});
  }
}
