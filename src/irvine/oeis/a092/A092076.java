package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092076 Expansion of (1+4*x^3+x^6)/((1-x)*(1-x^3)^2).
 * @author Sean A. Irvine
 */
public class A092076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092076() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 1, 1, 7, 7, 7, 19});
  }
}
