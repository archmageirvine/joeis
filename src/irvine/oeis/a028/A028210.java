package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028210 Expansion of 1/((1-6x)(1-8x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028210() {
    super(new long[] {-4320, 2172, -404, 33}, new long[] {1, 33, 685, 11445});
  }
}
