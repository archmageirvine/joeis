package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096886 Expansion of (1+3*x)/(1-8*x^2).
 * @author Sean A. Irvine
 */
public class A096886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096886() {
    super(new long[] {8, 0}, new long[] {1, 3});
  }
}
