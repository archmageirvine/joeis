package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021924 Expansion of 1/((1-x)(1-4x)(1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021924() {
    super(new long[] {-352, 516, -187, 24}, new long[] {1, 24, 389, 5364});
  }
}
