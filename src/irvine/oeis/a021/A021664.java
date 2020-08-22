package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021664 Expansion of 1/((1-x)(1-3x)(1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021664() {
    super(new long[] {-264, 409, -167, 23}, new long[] {1, 23, 362, 4894});
  }
}
