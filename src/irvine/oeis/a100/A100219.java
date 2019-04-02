package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100219 Expansion of (1-2*x)/((1-x)*(1-x+x^2)).
 * @author Sean A. Irvine
 */
public class A100219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100219() {
    super(new long[] {1, -2, 2}, new long[] {1, 0, -2});
  }
}
