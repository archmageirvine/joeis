package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186446 Expansion of 1/(1 - 7*x + 2*x^2).
 * @author Sean A. Irvine
 */
public class A186446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186446() {
    super(new long[] {-2, 7}, new long[] {1, 7});
  }
}
