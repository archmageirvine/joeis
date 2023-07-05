package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291311 Expansion of (1-x^2)/((1-x-x^2)*(1-x-x^4)).
 * @author Sean A. Irvine
 */
public class A291311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291311() {
    super(new long[] {-1, -1, 1, -1, 0, 2}, new long[] {1, 2, 3, 5, 9, 16});
  }
}
