package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021774 Expansion of 1/((1-x)(1-4x)(1-5x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021774() {
    super(new long[] {-200, 310, -129, 20}, new long[] {1, 20, 271, 3150});
  }
}
