package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111989 G.f.: 1/(1-6*x+8*x^3).
 * @author Sean A. Irvine
 */
public class A111989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111989() {
    super(new long[] {-8, 0, 6}, new long[] {1, 6, 36});
  }
}
