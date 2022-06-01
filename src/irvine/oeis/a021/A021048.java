package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021048 Expansion of 1/((1-x)(1-2x)(1-3x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021048() {
    super(new long[] {-54, 105, -65, 15}, new long[] {1, 15, 160, 1530});
  }
}
