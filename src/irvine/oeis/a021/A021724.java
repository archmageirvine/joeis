package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021724 Expansion of 1/((1-x)(1-3x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021724() {
    super(new long[] {-360, 546, -211, 26}, new long[] {1, 26, 465, 7150});
  }
}
