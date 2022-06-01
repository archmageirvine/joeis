package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021504 Expansion of 1/((1-x)(1-3x)(1-6x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021504() {
    super(new long[] {-162, 261, -117, 19}, new long[] {1, 19, 244, 2674});
  }
}
