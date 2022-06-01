package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096750 Expansion of (1-x+x^2)/(1-2x+2x^2-x^3-x^4).
 * @author Sean A. Irvine
 */
public class A096750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096750() {
    super(new long[] {1, 1, -2, 2}, new long[] {1, 1, 1, 1});
  }
}
