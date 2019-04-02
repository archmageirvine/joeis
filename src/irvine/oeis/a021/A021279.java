package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021279 Expansion of 1/((1-x)(1-2x)(1-8x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021279() {
    super(new long[] {-192, 328, -158, 23}, new long[] {1, 23, 371, 5227});
  }
}
