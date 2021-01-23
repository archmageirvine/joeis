package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124280 Expansion of 1/(1-x-x^2+x^3-x^4).
 * @author Sean A. Irvine
 */
public class A124280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124280() {
    super(new long[] {1, -1, 1, 1}, new long[] {1, 1, 2, 2});
  }
}
