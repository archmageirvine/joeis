package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018071 Expansion of 1/((1-3x)(1-8x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A018071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018071() {
    super(new long[] {288, -156, 23}, new long[] {1, 23, 373});
  }
}
