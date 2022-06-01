package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141523 Expansion of (3-2*x-3*x^2)/(1-x-x^2-x^3).
 * @author Sean A. Irvine
 */
public class A141523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141523() {
    super(new long[] {1, 1, 1}, new long[] {3, 1, 1});
  }
}
