package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097074 Expansion of (1-x+2x^2)/((1-x)(1-x-2x^2)).
 * @author Sean A. Irvine
 */
public class A097074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097074() {
    super(new long[] {-2, 1, 2}, new long[] {1, 1, 5});
  }
}
