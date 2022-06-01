package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116090 Expansion of 1/(1-x^2*(1+x)^3).
 * @author Sean A. Irvine
 */
public class A116090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116090() {
    super(new long[] {1, 3, 3, 1, 0}, new long[] {1, 0, 1, 3, 4});
  }
}
