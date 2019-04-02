package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028224 Expansion of 1/((1-7x)(1-8x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028224() {
    super(new long[] {-7392, 3268, -533, 38}, new long[] {1, 38, 911, 17632});
  }
}
