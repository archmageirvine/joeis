package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092353 Expansion of (1+x^3)/((1-x)^2*(1-x^3)^2).
 * @author Sean A. Irvine
 */
public class A092353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092353() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 2, 3, 7, 11, 15, 24, 33});
  }
}
