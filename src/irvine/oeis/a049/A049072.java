package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049072 Expansion of 1/(1 - 3*x + 4*x^2).
 * @author Sean A. Irvine
 */
public class A049072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049072() {
    super(new long[] {-4, 3}, new long[] {1, 3});
  }
}
