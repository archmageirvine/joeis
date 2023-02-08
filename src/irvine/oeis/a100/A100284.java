package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100284 Expansion of (1-4*x-x^2)/((1-x)*(1-4*x-5*x^2)).
 * @author Sean A. Irvine
 */
public class A100284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100284() {
    super(new long[] {-5, 1, 5}, new long[] {1, 1, 5});
  }
}
