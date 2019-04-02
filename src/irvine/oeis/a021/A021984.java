package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021984 Expansion of 1/((1-x)(1-4x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021984() {
    super(new long[] {-440, 634, -219, 26}, new long[] {1, 26, 457, 6822});
  }
}
