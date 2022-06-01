package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092200 Expansion of (1+2x)/((1-x)(1-x^3)).
 * @author Sean A. Irvine
 */
public class A092200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092200() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 3, 4});
  }
}
