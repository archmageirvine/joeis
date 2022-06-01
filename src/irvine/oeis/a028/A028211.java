package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028211 Expansion of 1/((1-6x)(1-8x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028211() {
    super(new long[] {-4752, 2346, -427, 34}, new long[] {1, 34, 729, 12614});
  }
}
