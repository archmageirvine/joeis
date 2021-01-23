package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102129 Expansion of (1 - x)*(1 + 2*x) / ((1 + x)*(1 - 4*x - x^2)).
 * @author Sean A. Irvine
 */
public class A102129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102129() {
    super(new long[] {1, 5, 3}, new long[] {1, 4, 15});
  }
}
