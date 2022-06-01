package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028192 Expansion of 1/((1-5x)(1-8x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028192() {
    super(new long[] {-4320, 2244, -421, 34}, new long[] {1, 34, 735, 12920});
  }
}
