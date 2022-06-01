package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028108 Expansion of 1/((1-3x)(1-10x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028108() {
    super(new long[] {-3960, 2406, -461, 36}, new long[] {1, 36, 835, 15870});
  }
}
