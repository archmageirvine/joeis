package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028213 Expansion of 1/((1-6x)(1-8x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028213() {
    super(new long[] {-5280, 2548, -452, 35}, new long[] {1, 35, 773, 13783});
  }
}
