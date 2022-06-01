package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077959 Expansion of 1/(1+2*x^3).
 * @author Sean A. Irvine
 */
public class A077959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077959() {
    super(new long[] {-2, 0, 0}, new long[] {1, 0, 0});
  }
}
