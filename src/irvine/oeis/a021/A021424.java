package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021424 Expansion of 1/((1-x)(1-3x)(1-5x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A021424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021424() {
    super(new long[] {-105, 176, -86, 16}, new long[] {1, 16, 170, 1520});
  }
}
