package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021334 Expansion of 1/((1-x)(1-2x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021334() {
    super(new long[] {-264, 442, -203, 26}, new long[] {1, 26, 473, 7462});
  }
}
