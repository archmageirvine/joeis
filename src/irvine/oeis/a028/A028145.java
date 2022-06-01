package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028145 Expansion of 1/((1-4x)(1-7x)(1-8x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A028145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028145() {
    super(new long[] {-2016, 1268, -287, 28}, new long[] {1, 28, 497, 7148});
  }
}
