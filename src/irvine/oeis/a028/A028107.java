package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028107 Expansion of 1/((1-3x)(1-9x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028107() {
    super(new long[] {-3564, 2205, -435, 35}, new long[] {1, 35, 790, 14630});
  }
}
