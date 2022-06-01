package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021364 Expansion of 1/((1-x)(1-3x)(1-4x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A021364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021364() {
    super(new long[] {-84, 145, -75, 15}, new long[] {1, 15, 150, 1270});
  }
}
