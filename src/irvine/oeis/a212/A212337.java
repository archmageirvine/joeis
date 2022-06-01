package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212337 Expansion of 1/(1-4*x+3*x^2)^2.
 * @author Sean A. Irvine
 */
public class A212337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212337() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 8, 42, 184});
  }
}
