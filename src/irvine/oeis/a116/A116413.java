package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116413 Expansion of (1+x)/(1-2x-x^2-x^3).
 * @author Sean A. Irvine
 */
public class A116413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116413() {
    super(new long[] {1, 1, 2}, new long[] {1, 3, 7});
  }
}
