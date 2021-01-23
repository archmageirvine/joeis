package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028049 Expansion of 1/((1-3x)(1-4x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028049() {
    super(new long[] {-1296, 1008, -267, 28}, new long[] {1, 28, 517, 8008});
  }
}
