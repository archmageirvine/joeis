package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028040 Expansion of 1/((1-3x)(1-4x)(1-7x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028040() {
    super(new long[] {-840, 694, -201, 24}, new long[] {1, 24, 375, 4870});
  }
}
