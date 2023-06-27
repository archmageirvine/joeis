package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270444 Expansion of 2*(1+2*x) / (1-8*x+4*x^2).
 * @author Sean A. Irvine
 */
public class A270444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270444() {
    super(1, new long[] {-4, 8}, new long[] {2, 20});
  }
}
