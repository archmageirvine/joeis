package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021354 Expansion of 1/((1-x)(1-3x)(1-4x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A021354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021354() {
    super(new long[] {-72, 126, -67, 14}, new long[] {1, 14, 129, 994});
  }
}
