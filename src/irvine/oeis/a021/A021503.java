package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021503 Expansion of 1/((1-x)(1-3x)(1-6x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021503() {
    super(new long[] {-144, 234, -107, 18}, new long[] {1, 18, 217, 2214});
  }
}
