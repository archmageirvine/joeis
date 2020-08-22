package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020447 Expansion of 1/((1-5x)(1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A020447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020447() {
    super(new long[] {440, -183, 24}, new long[] {1, 24, 393});
  }
}
