package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028102 Expansion of <code>1/((1-3x)(1-8x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028102() {
    super(new long[] {-2640, 1714, -365, 32}, new long[] {1, 32, 659, 11122});
  }
}
