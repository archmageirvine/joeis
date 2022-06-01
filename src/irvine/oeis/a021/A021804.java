package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021804 Expansion of 1/((1-x)(1-4x)(1-6x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A021804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021804() {
    super(new long[] {-168, 262, -111, 18}, new long[] {1, 18, 213, 2098});
  }
}
