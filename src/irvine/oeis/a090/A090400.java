package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090400 Expansion of 1/(1-3x+3x^3) in powers of x.
 * @author Sean A. Irvine
 */
public class A090400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090400() {
    super(new long[] {-3, 0, 3}, new long[] {1, 3, 9});
  }
}
