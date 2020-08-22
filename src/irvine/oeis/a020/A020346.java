package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020346 Expansion of 1/((1-5x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A020346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020346() {
    super(new long[] {400, -170, 23}, new long[] {1, 23, 359});
  }
}
