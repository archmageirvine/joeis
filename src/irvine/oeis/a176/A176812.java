package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176812 Expansion of 3*(1+x)/(1-2*x-5*x^2).
 * @author Sean A. Irvine
 */
public class A176812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176812() {
    super(new long[] {5, 2}, new long[] {3, 9});
  }
}
