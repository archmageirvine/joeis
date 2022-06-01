package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054485 Expansion of (1+3*x)/(1-4*x+x^2).
 * @author Sean A. Irvine
 */
public class A054485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054485() {
    super(new long[] {-1, 4}, new long[] {1, 7});
  }
}
