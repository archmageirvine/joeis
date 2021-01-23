package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100215 Expansion of (4 - 7*x + 2*x^2)/((1-2*x)*(1 - 2*x + 2*x^2)).
 * @author Sean A. Irvine
 */
public class A100215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100215() {
    super(new long[] {4, -6, 4}, new long[] {4, 9, 14});
  }
}
