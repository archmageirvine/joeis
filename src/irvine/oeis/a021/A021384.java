package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021384 Expansion of 1/((1-x)(1-3x)(1-4x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021384() {
    super(new long[] {-120, 202, -99, 18}, new long[] {1, 18, 225, 2470});
  }
}
