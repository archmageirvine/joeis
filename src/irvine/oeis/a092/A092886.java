package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092886 Expansion of x/(x^4-x^3-2x^2-x+1).
 * @author Sean A. Irvine
 */
public class A092886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092886() {
    super(new long[] {-1, 1, 2, 1}, new long[] {0, 1, 1, 3});
  }
}
