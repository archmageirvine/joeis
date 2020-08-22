package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021314 Expansion of 1/((1-x)(1-2x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021314() {
    super(new long[] {-220, 372, -175, 24}, new long[] {1, 24, 401, 5796});
  }
}
