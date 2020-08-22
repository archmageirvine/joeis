package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028128 Expansion of 1/((1-4x)(1-5x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028128() {
    super(new long[] {-2400, 1520, -338, 31}, new long[] {1, 31, 623, 10355});
  }
}
