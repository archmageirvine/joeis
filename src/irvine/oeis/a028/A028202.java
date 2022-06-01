package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028202 Expansion of 1/((1-6x)(1-7x)(1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028202() {
    super(new long[] {-3696, 1942, -377, 32}, new long[] {1, 32, 647, 10582});
  }
}
